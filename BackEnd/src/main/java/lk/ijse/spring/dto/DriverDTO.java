package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : A.D.Liyanage
 * @service : 1.0
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO extends CarDTO {
    private String id;
    private String name;
    private String address;
    private int contact;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
