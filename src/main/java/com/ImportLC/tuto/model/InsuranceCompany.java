package com.ImportLC.tuto.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * @author Haider
 *
 */
@Entity
public class InsuranceCompany {
	// @Id
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int InsurerId;
	@Column
	private String InsurerName;
	@Column
	private String InsurerAddress;

	public Insurer(int InsurerId, String InsurerName,
			String InsurerAddress) {
		super();
		this.InsurerId = InsurerId;
		this.InsurerName = InsurerName;
		this.InsurerAddress = InsurerAddress;
	}

	public Insurer() {
		super();
	}

	public int getInsurerId() {
		return InsurerId;
	}

	public void setInsurerId(int InsurerId) {
		this.InsurerId = InsurerId;
	}

	public String getInsurerName() {
		return InsurerName;
	}

	public void setInsurerName(String InsurerName) {
		this.InsurerName = InsurerName;
	}

	public String getInsurerAddress() {
		return InsurerAddress;
	}

	public void setInsurerAddress(String InsurerAddress) {
		this.InsurerAddress = InsurerAddress;
	}


	@Override
	public String toString() {
		return "Cutomer [InsurerId=" + InsurerId + ", InsurerName=" + InsurerName
				+ ", InsurerAddress=" + InsurerAddress + "]";
	}
}
