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
public class Counterparty {
	// @Id
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int CounterpartyId;
	@Column
	private String CounterpartyName;
	@Column
	private String CounterpartyAddress;
	@Column
	private double ImportLCExposureLimit;
	@Column
	private double ExportLCExposureLimit;
	@Column
	private double GuaranteeExposureLimit;

	public Counterparty(int CounterpartyId, String CounterpartyName,
			String CounterpartyAddress, 
	 double ImportLCExposureLimit,
	
	 double ExportLCExposureLimit,
	
	 double GuaranteeExposureLimit) {
		super();
		this.CounterpartyId = CounterpartyId;
		this.CounterpartyName = CounterpartyName;
		this.CounterpartyAddress = CounterpartyAddress;
		this.ImportLCExposureLimit = ImportLCExposureLimit;
		this.ExportLCExposureLimit = ExportLCExposureLimit;
		this.GuaranteeExposureLimit = GuaranteeExposureLimit;
	}

	public Counterparty() {
		super();
	}

	public int getCounterpartyId() {
		return CounterpartyId;
	}

	public void setCounterpartyId(int CounterpartyId) {
		this.CounterpartyId = CounterpartyId;
	}

	public String getCounterpartyName() {
		return CounterpartyName;
	}

	public void setCounterpartyName(String CounterpartyName) {
		this.CounterpartyName = CounterpartyName;
	}

	public String getCounterpartyAddress() {
		return CounterpartyAddress;
	}

	public void setCounterpartyAddress(String CounterpartyAddress) {
		this.CounterpartyAddress = CounterpartyAddress;
	}

	public double getImportLCExposureLimit() {
		return ImportLCExposureLimit;
	}

	public void setImportLCExposureLimit(double ImportLCExposureLimit) {
		this.ImportLCExposureLimit = ImportLCExposureLimit;
	}

	public double getExportLCExposureLimit() {
		return ExportLCExposureLimit;
	}

	public void setExportLCExposureLimit(double ExportLCExposureLimit) {
		this.ExportLCExposureLimit = ExportLCExposureLimit;
	}

	public double getGuaranteeExposureLimit() {
		return GuaranteeExposureLimit;
	}

	public void setGuaranteeExposureLimit(double GuaranteeExposureLimit) {
		this.GuaranteeExposureLimit = GuaranteeExposureLimit;
	}

	@Override
	public String toString() {
		return "Cutomer [CounterpartyId=" + CounterpartyId + ", CounterpartyName=" + CounterpartyName
				+ ", CounterpartyAddress=" + CounterpartyAddress + ", ImportLCExposureLimit=" + ImportLCExposureLimit
				+ ", ExportLCExposureLimit=" + ExportLCExposureLimit + ", GuaranteeExposureLimit=" + GuaranteeExposureLimit 	+ "]";
	}
}
