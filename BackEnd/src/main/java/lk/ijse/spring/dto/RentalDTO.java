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
public class RentalDTO {
    private String rentId;
    private String startDate;
    private String endDate;
    private double price;
    private int extraKM;
    private String carId;
    private String id;
    private String dId;

    public String getRentId() {
        return rentId;
    }

    public void setRentId(String rentId) {
        this.rentId = rentId;
    }
}
