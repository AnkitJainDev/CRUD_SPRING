package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	@Id
    @Column(name="empid",unique=true, nullable=false)
	private Integer employeeId;
	
	@Column(name="employeename")
	private String  employeeName;
	
	
	@OneToMany(
	        mappedBy = "Employeeid",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
    private List<EmployeeCountEntity> employeeCountList;
	
	@OneToMany(
	        mappedBy = "Employeeid",
	        cascade = CascadeType.ALL,
	        orphanRemoval = true
	    )
    private List<EmployeeDeptEntity> employeeDeptList;
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public List<EmployeeCountEntity> getEmployeeCountList() {
		return employeeCountList;
	}

	public void setEmployeeCountList(List<EmployeeCountEntity> employeeCountList) {
		this.employeeCountList = employeeCountList;
	}

	public List<EmployeeDeptEntity> getEmployeeDeptList() {
		return employeeDeptList;
	}

	public void setEmployeeDeptList(List<EmployeeDeptEntity> employeeDeptList) {
		this.employeeDeptList = employeeDeptList;
	}
	
	
	
	

}
