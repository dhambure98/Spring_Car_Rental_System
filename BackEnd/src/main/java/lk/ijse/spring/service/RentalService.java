package lk.ijse.spring.service;

import lk.ijse.spring.dto.RentalDTO;

import java.util.ArrayList;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

public interface RentalService {
    boolean addRental(RentalDTO dto);
    boolean deleteRental(String id);
    ArrayList<RentalDTO> getAllRentals();
}
