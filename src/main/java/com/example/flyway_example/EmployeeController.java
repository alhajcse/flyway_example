package com.example.flyway_example;

import com.example.flyway_example.entity.Employee;
import com.example.flyway_example.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/employee")
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    @GetMapping("/all")
    public ResponseEntity<Object> singleNIDVerification() {

        List<Employee> employee=employeeRepository.findAll();
        return ok(employeeRepository.findAll());
    }

}
