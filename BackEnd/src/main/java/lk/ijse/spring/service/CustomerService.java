package lk.ijse.spring.service;

import lk.ijse.spring.dto.CustomerDTO;
import java.util.ArrayList;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

public interface CustomerService {
    boolean addCustomer(CustomerDTO dto);
    CustomerDTO searchCustomer(String id);
    boolean deleteCustomer(String id);
    boolean updateCustomer(CustomerDTO dto);
    ArrayList<CustomerDTO> getAllCustomers();
    CustomerDTO searchCustomerByName(String id,String password);

}
