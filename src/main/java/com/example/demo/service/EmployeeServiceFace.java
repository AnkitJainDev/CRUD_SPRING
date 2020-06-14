package com.example.demo.service;

import com.example.demo.dto.Employee;
import java.util.*;
import com.example.demo.entity.EmployeeEntity;

public interface EmployeeServiceFace {
	
	EmployeeEntity save(Employee emp);
	List<EmployeeEntity> get();

}
