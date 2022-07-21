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
public class Car {
    @Id
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
}

