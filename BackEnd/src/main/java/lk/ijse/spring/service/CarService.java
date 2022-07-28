package lk.ijse.spring.service;

import lk.ijse.spring.dto.CarDTO;
import java.util.ArrayList;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/


public interface CarService {
    boolean addCar(CarDTO dto);
    boolean updateCar(CarDTO dto);
    boolean deleteCar(String id);
    CarDTO searchCar(String id);
    ArrayList<CarDTO> getAllCars();
}
