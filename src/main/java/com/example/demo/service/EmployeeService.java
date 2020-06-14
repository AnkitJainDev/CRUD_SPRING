package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeCountRepository;
import com.example.demo.dao.EmployeeDeptRepository;
import com.example.demo.dao.EmployeeRepository;
import com.example.demo.dto.Employee;
import com.example.demo.entity.EmployeeCountEntity;
import com.example.demo.entity.EmployeeDeptEntity;
import com.example.demo.entity.EmployeeEntity;

@Service
public class EmployeeService implements EmployeeServiceFace {

	@Autowired
	EmployeeRepository employeeRep;
	
	@Autowired
	EmployeeDeptRepository employeeDeptRep;
	
	@Autowired
	EmployeeCountRepository employeeCountRep;
	
	@Override
	public EmployeeEntity save(Employee emp) {
		
		EmployeeEntity employee=new EmployeeEntity();
		List<EmployeeCountEntity> listOne=new ArrayList<>();
		List<EmployeeDeptEntity> listTwo=new ArrayList<>();
		emp.getListCount().forEach(e->{
			EmployeeCountEntity employeeCountEntity=new EmployeeCountEntity();
			employeeCountEntity.setEmployeeCountId(e.getEmployeeCountId());
			employeeCountEntity.setEmployeeid(employee);
			listOne.add(employeeCountEntity);
		});
		
		emp.getListDep().forEach(e->{
			EmployeeDeptEntity deptEntity=new EmployeeDeptEntity();
			deptEntity.setEmployeeDeptId(e.getEmployeeDeptId());
			deptEntity.setEmployeeid(employee);
			listTwo.add(deptEntity);
		});
		employee.setEmployeeId(emp.getEmpId());
		employee.setEmployeeName(emp.getEmpName());
		
		
		//important
		employee.setEmployeeCountList(listOne);
		employee.setEmployeeDeptList(listTwo);
		
		EmployeeEntity employeeSaved=employeeRep.save(employee);
		return employeeSaved;
	}

	@Override
	public List<EmployeeEntity> get() {
		return employeeRep.findAll();
	}

}
