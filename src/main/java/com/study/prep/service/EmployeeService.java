package com.study.prep.service;

import com.study.prep.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getEmployees();
    Optional<Employee> getEmployee(Long id);
    Employee createEmployee(Employee employee);
    void deleteEmployee(Long id);
}
