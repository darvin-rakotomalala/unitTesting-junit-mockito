package com.poc.service.application;

import com.poc.mapper.EmployeeMapper;
import com.poc.model.dto.EmployeeDTO;
import com.poc.service.business.EmployeeCUDSM;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@RequiredArgsConstructor
@Service
public class EmployeeCUDSAImpl implements EmployeeCUDSA {

    private final EmployeeCUDSM employeeCUDSM;
    private final EmployeeMapper employeeMapper;

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {
        return employeeMapper.toDTO(employeeCUDSM.saveEmployee(employeeMapper.toDO(employeeDTO)));
    }

    @Override
    public EmployeeDTO updateEmployee(EmployeeDTO employeeDTO) {
        return employeeMapper.toDTO(employeeCUDSM.updateEmployee(employeeMapper.toDO(employeeDTO)));
    }

    @Override
    public void deleteEmployee(UUID id) {
        employeeCUDSM.deleteEmployee(id);
    }
}
