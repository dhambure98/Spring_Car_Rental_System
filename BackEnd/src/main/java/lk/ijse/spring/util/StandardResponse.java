package lk.ijse.spring.util;

import lk.ijse.spring.dto.CarDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StandardResponse {
    private String code;
    private String message;
    private Object data;

    public StandardResponse(String s, String done, CarDTO dto) {
    }
}
