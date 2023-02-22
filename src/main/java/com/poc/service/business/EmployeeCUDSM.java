package com.poc.service.business;

import com.poc.model.domain.Employee;

import java.util.UUID;

public interface EmployeeCUDSM {
    Employee saveEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    void deleteEmployee(UUID id);
}
