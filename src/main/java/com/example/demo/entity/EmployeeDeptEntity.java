package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="employeedept")
public class EmployeeDeptEntity {
	
	@Id
    @Column(name="idemployeedept",unique=true, nullable=false)
	private Integer employeeDeptId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employeeid", nullable = false)
	private EmployeeEntity Employeeid;

	public Integer getEmployeeDeptId() {
		return employeeDeptId;
	}

	public void setEmployeeDeptId(Integer employeeDeptId) {
		this.employeeDeptId = employeeDeptId;
	}

	public EmployeeEntity getEmployeeid() {
		return Employeeid;
	}

	public void setEmployeeid(EmployeeEntity employeeid) {
		Employeeid = employeeid;
	}


}
