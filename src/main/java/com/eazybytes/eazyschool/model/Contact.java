package com.eazybytes.eazyschool.model;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class Contact {

    @NotBlank(message = "Name Must not be Blank")
    @Size(min = 3, message = "Name must be at least 3 Characters Long")
    private String name;

    @NotBlank(message = "Mobile Number Must not be Blank")
    @Pattern(regexp = "(^$|[0-9]{10})" , message = "Mobile Number must be 10 Digits")
    private String mobileNum;

    @NotBlank(message = "Email Must not be Blank")
    @Email(message = "Please Provide a Valid Email Address")
    private String email;

    @NotBlank(message = "Subject Must not be Blank")
    @Size(min = 5, message = "Subject must be at least 3 Characters Long")
    private String subject;

    @NotBlank(message = "Message Must not be Blank")
    @Size(min = 10, message = "Message must be at least 10   Characters Long")
    private String message;
}
