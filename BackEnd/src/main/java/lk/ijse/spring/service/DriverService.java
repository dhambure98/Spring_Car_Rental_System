package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.dto.DriverDTO;
import java.util.ArrayList;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

public interface DriverService {
    boolean addDriver(DriverDTO dto);
    DriverDTO searchDriver(String id);
    boolean deleteDriver(String id);
    boolean updateDriver(DriverDTO dto);
    ArrayList<DriverDTO> getAllDriver();
}
