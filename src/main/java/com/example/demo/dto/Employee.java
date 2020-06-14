package com.example.demo.dto;

import java.util.List;

import com.example.demo.entity.EmployeeCountEntity;
import com.example.demo.entity.EmployeeDeptEntity;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
	
	@JsonProperty("EMPLOYEE_ID")
	int empId;
	
	@JsonProperty("EMPLOYEE_NAME")
	String empName;
	
	@JsonProperty("EMPLOYEE_COUNT_LIST")
	List<EmployeeCountEntity> listCount;
	
	@JsonProperty("EMPLOYEE_DEPT_LIST")
	List<EmployeeDeptEntity> listDep;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public List<EmployeeCountEntity> getListCount() {
		return listCount;
	}

	public void setListCount(List<EmployeeCountEntity> listCount) {
		this.listCount = listCount;
	}

	public List<EmployeeDeptEntity> getListDep() {
		return listDep;
	}

	public void setListDep(List<EmployeeDeptEntity> listDep) {
		this.listDep = listDep;
	}


}
