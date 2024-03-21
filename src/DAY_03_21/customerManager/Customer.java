package DAY_03_21.customerManager;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private String name;
    private char gender;
    private String email;
    private int birthYear;
}
// Value Object(vo)
// Data Transfer Object(DTO)
// 값을 갖는 객체를 만들기 위한 클래스