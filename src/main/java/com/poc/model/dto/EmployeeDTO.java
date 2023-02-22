package com.poc.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class EmployeeDTO {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
}
