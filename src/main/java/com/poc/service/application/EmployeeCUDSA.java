package com.poc.service.application;

import com.poc.model.dto.EmployeeDTO;

import java.util.UUID;

public interface EmployeeCUDSA {
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    EmployeeDTO updateEmployee(EmployeeDTO employeeDTO);
    void deleteEmployee(UUID id);
}
