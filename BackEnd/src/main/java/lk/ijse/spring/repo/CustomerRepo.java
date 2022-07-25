package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

public interface CustomerRepo extends JpaRepository<Customer,String> {
    Optional<Customer> findTopByIdAndPassword(String id, String password);
}
