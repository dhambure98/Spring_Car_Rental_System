package lk.ijse.spring.service.Impl;

import lk.ijse.spring.dto.CarDTO;
import lk.ijse.spring.entity.Car;
import lk.ijse.spring.repo.CarRepo;
import lk.ijse.spring.service.CarService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

@Service
@Transactional
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo repo;
    @Autowired
    private ModelMapper mapper;

    @Override
    public boolean addCar(CarDTO dto) {
        if (repo.existsById(dto.getCarId())) {
            throw new RuntimeException("Car Is Already Exist...");
        }
        repo.save(mapper.map(dto, Car.class));
        return true;
    }

    @Override
    public boolean updateCar(CarDTO dto) {
        if (repo.existsById(dto.getCarId())) {
            repo.save(mapper.map(dto,Car.class));
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCar(String id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Car is Not Found...");
        }
        repo.deleteById(id);
        return true;
    }

    @Override
    public CarDTO searchCar(String id) {
        Optional<Car> car = repo.findById(id);
        if (car.isPresent()) {
            return mapper.map(car.get(),CarDTO.class);
        }
        return null;
    }

    @Override
    public ArrayList<CarDTO> getAllCars() {
        List<Car> all = repo.findAll();
        return mapper.map(all, new TypeToken<ArrayList<CarDTO>>(){}.getType());
    }
}
