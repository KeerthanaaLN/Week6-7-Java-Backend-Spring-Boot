package com.example.EmployeeManagementApp;

import jakarta.persistence.GeneratedValue;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping
    public Employee addEmployee(@RequestBody @Valid EmployeeDTO employeeDTO){
        return employeeServices.addEmployee(employeeDTO);
    }

    @PutMapping("/{id}")
    public Employee updateEmployee(@PathVariable int id,@RequestBody @Valid EmployeeDTO employeeDTO){
        return employeeServices.updateEmployee(id,employeeDTO);
    }

    @GetMapping
    public List<Employee> getEmployee(){
        return employeeServices.getEmployee();
    }
    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeServices.getEmployeeById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeServices.deleteEmployee(id);
    }


}
