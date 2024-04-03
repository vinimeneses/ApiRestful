package net.javaguides.springboot.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Schema(description = "User Data Transfer Object (DTO) Information")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private Long id;

    @Schema(description = "First name of the User", example = "John")
    @NotEmpty(message = "First name should not be null or empty")
    @NotEmpty(message = "First name should not be null or empty")
    private String firstName;

    @Schema(description = "Last name of the User", example = "Doe")
    @NotEmpty(message = "Last name should not be null or empty")
    private String lastName;

    @Schema(description = "Email of the User", example = "teste@gmail.com")
    @NotEmpty(message = "Email should not be null or empty")
    @Email(message = "Email should be valid")
    private String email;

}