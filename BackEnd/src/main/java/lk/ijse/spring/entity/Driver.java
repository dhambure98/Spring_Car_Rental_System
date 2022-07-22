package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Driver {
    @Id
    private String id;
    private String name;
    private String address;
    private int contact;
}
