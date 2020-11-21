package pl.sda.spring_start.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    @NotBlank(message = "Email must be not empty")
    @Email(message = "Email address is not valid")
    private String email;
    @Size(min = 8, max = 128, message = "Password must have number of characters between {min} and {max}")
    @Pattern(regexp = "([A-Z]{1,}.*\\d{1,}|\\d{1,}.*[A-Z]{1,})", message = "Password must have ath least 1 capital letter and 1 digit")
//    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$", message = "Password is not valid")
    private String password;
}
