package com.celilensar.accounts.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AccountsDto {

    @NotEmpty(message ="email should not be empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number should be 10 digits")
    private Long accountNumber;
@NotEmpty(message ="Account type should not be empty")
    private String accountType;
@NotEmpty(message = "Branch address should not be empty")
    private String branchAddress;

}

