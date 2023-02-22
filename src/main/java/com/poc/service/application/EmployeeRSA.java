package com.poc.service.application;

import com.poc.model.dto.EmployeeDTO;

import java.util.List;
import java.util.UUID;

public interface EmployeeRSA {
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(UUID id);
}
