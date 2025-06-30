package com.celilensar.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer & Account information"
)
public class CustomerDto {
    @Schema(
            description = "Name of the Customer",
            example = "Ensar Celil"
    )
    @NotEmpty(message ="Name should not be empty")
    @Size(min=5,max=30, message = "Name should be between 5 and 30 characters")
    private String name;
    @Schema(
            description = "email adress of the Customer",
            example = "c4V3o@example.com"
    )
    @NotEmpty(message ="email should not be empty")
    @Email
    private String email;
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @Schema(
            description = "mobile number of the Customer",
            example = "5315616616"
    )
    private String mobileNumber;

    @Schema(
            description = "account details of the Customer"
    )
    private AccountsDto accountsDto;
}
