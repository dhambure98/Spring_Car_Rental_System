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
public class CarDTO {
    private String carId;
    private String brand;
    private String category;
    private String transmission;
    private String fuelType;
    private double dailyRate;
    private double monthlyRate;
    private int freeKmforDay;
    private int freeKmforMonth;
    private double priceforExtraKm ;
    private int available ;
    private String registrationNumber;
    private String color;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }
}
