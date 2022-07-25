package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

public interface RentalRepo extends JpaRepository<Rental,String> {
}
