package com.example.spring_project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/add")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeRepository.save(employee);
    }

    @GetMapping("/all")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable String id) {
        return employeeRepository.findById(id);
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@PathVariable String id, @RequestBody Employee updatedEmployee) {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(updatedEmployee.getName());
                    employee.setDepartment(updatedEmployee.getDepartment());
                    employee.setSalary(updatedEmployee.getSalary());
                    return employeeRepository.save(employee);
                }).orElseGet(() -> {
                    updatedEmployee.setId(id);
                    return employeeRepository.save(updatedEmployee);
                });
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable String id) {
        employeeRepository.deleteById(id);
    }
}
