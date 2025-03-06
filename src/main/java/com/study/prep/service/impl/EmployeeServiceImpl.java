package com.study.prep.service.impl;

import com.study.prep.entity.Employee;
import com.study.prep.service.EmployeeService;
import com.study.prep.store.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository repository;
    @Override
    public List<Employee> getEmployees() {
        return repository.findAll();
    }

    @Override
    public Optional<Employee> getEmployee(Long id) {
        return repository.findById(id);
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}
