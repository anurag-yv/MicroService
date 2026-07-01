package com.example.second.Controller;//package com.example.second.Controller;
//
//
//import com.example.second.Exception.EmployeeNotFoundException;
//import com.example.second.entity.Employee;
//import com.example.second.repo.MyRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class MyController {
//    @Autowired
//    private MyRepo myRepo;
//
//    @PostMapping("/addEmployee")
//    public String addEmployee(@RequestBody Employee employee){
//        myRepo.save(employee);
//        return "Employee added successfully";
//    }
//    @GetMapping("/getEmployee")
//    public List<Employee> getEmployee(){
//        return myRepo.findAll();
//    }
//    @GetMapping("/getEmployeeById/{id}")
//    public Employee getEmployeeById(@PathVariable int id){
//        Employee existingEmployee = myRepo.findById(id).orElse(null);
//        if(existingEmployee==null){
//            throw new EmployeeNotFoundException("Not found employee in the database "+id);
//        }
//        return existingEmployee;
//    }
//    @DeleteMapping("/deleteEmployee/{id}")
//    public String deleteEmployee(@PathVariable int id) {
//        myRepo.deleteById(id);
//        return "Employee deleted successfully";
//    }
//    @PutMapping("/updateEmployee/{id}")
//    public String updateEmployee(@PathVariable int id,
//                                 @RequestBody Employee employee) {
//
//        Employee existingEmployee = myRepo.findById(id).orElse(null);
//
//        if (existingEmployee == null) {
//            return "Employee not found";
//        }
//
//        existingEmployee.setName(employee.getName());
//        existingEmployee.setSalary(employee.getSalary());
//
//        myRepo.save(existingEmployee);
//
//        return "Employee updated successfully";
//    }
//}

import com.example.second.Model.Employee1;
import com.example.second.Services.MyService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    private MyService service;

    @GetMapping("/getAllEmployee")
    public List<Employee1> getAllEmployee() {
        return service.getAllEmployee();
    }

    @GetMapping("/getAllEmployee/{id}")
    public Employee1  getAllEmployeebyID(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping("/addEmployee")
    public String addEmployee(@Valid @RequestBody Employee1 employee) {
        return service.addEmployee(employee);
    }

    @PutMapping("/updateEmployee/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody Employee1 updatedEmployee) {
        return service.updateEmployee(id, updatedEmployee);
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {
        return service.deleteEmployee(id);
    }

    @DeleteMapping("/deleteAllEmployee")
    public String deleteAllEmployee() {
        return service.deleteAllEmployees();
    }
}