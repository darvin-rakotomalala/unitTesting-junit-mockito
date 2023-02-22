package com.poc.service.business;

import com.poc.model.domain.Employee;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EmployeeRSM {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(UUID id);
}
