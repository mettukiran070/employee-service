package com.example.employee.service;

import com.example.employee.entity.Employee;
import com.example.employee.repository.EmployeeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public Employee save(Employee employee) {
        return this.repository.save(employee);
    }

    public List<Employee> getAll() {
        return this.repository.findAll();
    }

    public Optional<Employee> getById(Long id) {
        return this.repository.findById(id);
    }

    public Employee update(Employee employee) {
        return this.repository.save(employee);
    }

    public void delete(Long id) {
        this.repository.deleteById(id);
    }

}
