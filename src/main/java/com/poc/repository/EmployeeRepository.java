package com.poc.repository;

import com.poc.model.domain.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import java.util.UUID;

public interface EmployeeRepository extends MongoRepository<Employee, UUID> {
    Optional<Employee> findByEmail(String email);
}
