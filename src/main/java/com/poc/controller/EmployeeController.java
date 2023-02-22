package com.poc.controller;

import com.poc.model.dto.EmployeeDTO;
import com.poc.service.application.EmployeeCUDSA;
import com.poc.service.application.EmployeeRSA;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "employees")
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeCUDSA employeeCUDSA;
    private final EmployeeRSA employeeRSA;

    @PostMapping
    public EmployeeDTO saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeCUDSA.saveEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeRSA.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") UUID id) {
        return employeeRSA.getEmployeeById(id);
    }

    @PutMapping
    public EmployeeDTO updateEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeCUDSA.updateEmployee(employeeDTO);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable("id") UUID id) {
        employeeCUDSA.deleteEmployee(id);
        return "Employee deleted successfully !";
    }

}
