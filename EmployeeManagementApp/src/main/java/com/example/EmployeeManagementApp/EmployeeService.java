package com.example.EmployeeManagementApp;

import java.util.List;

public interface EmployeeService {
    Employee addEmployee(EmployeeDTO employeeDTO);
    Employee getEmployeeById(int id);
    Employee updateEmployee(int id, EmployeeDTO employeeDTO);
    List<Employee> getEmployee();
    void deleteEmployee(int id);
}
