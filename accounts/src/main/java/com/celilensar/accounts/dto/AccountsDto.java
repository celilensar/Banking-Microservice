package com.celilensar.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account information"
)
public class AccountsDto {

    @NotEmpty(message ="email should not be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    @Schema(
            description = "Account number of the Customer"
    )
    private Long accountNumber;
    @NotEmpty(message ="Account type should not be empty")
    @Schema(
            description = "Account Type of the Customer Account",
            example = "Savings"
    )
    private String accountType;
    @NotEmpty(message = "Branch address should not be empty")
    @Schema(
            description = "Branch address of the Bank Account",
            example = "Kadubeesanahalli, Bangalore"
    )

    private String branchAddress;

}

