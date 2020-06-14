package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeecount")
public class EmployeeCountEntity {
	
	@Id
    @Column(name="idemployeecount",unique=true, nullable=false)
	private Integer employeeCountId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employeeid", nullable = false)
	private EmployeeEntity Employeeid;

	public Integer getEmployeeCountId() {
		return employeeCountId;
	}

	public void setEmployeeCountId(Integer employeeCountId) {
		this.employeeCountId = employeeCountId;
	}

	public EmployeeEntity getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(EmployeeEntity employeeid) {
		Employeeid = employeeid;
	}

}
