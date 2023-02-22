package com.poc.model.domain;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "employee")
public class Employee {

    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
}
