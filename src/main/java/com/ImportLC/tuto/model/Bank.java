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
public class Bank {
	// @Id
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int BankId;
	@Column
	private String BankName;
	@Column
	private String BankAddress;
	@Column
	private String BICCode;
	@Column
	private String Correspondent;
	@Column
	private String NostroAcNum;
	@Column
	private double ImportLCExposureLimit;
	@Column
	private double ExportLCExposureLimit;
	@Column
	private double GuaranteeExposureLimit;

	public Bank(int BankId, String BankName,
			String BankAddress,  String BICCode,
	
	 String Correspondent,
	
	 String NostroAcNum,
	
	 double ImportLCExposureLimit,
	
	 double ExportLCExposureLimit,
	
	 double GuaranteeExposureLimit) {
		super();
		this.BankId = BankId;
		this.BankName = BankName;
		this.BankAddress = BankAddress;
		this.BICCode = BICCode;
		this.Correspondent = Correspondent;
		this.NostroAcNum = NostroAcNum;
		this.ImportLCExposureLimit = ImportLCExposureLimit;
		this.ExportLCExposureLimit = ExportLCExposureLimit;
		this.GuaranteeExposureLimit = GuaranteeExposureLimit;
	}

	public Bank() {
		super();
	}

	public int getBankId() {
		return BankId;
	}

	public void setBankId(int BankId) {
		this.BankId = BankId;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String BankName) {
		this.BankName = BankName;
	}

	public String getBankAddress() {
		return BankAddress;
	}

	public void setBankAddress(String BankAddress) {
		this.BankAddress = BankAddress;
	}

	public String getBICCode() {
		return BICCode;
	}

	public void setBICCode(String BICCode) {
		this.BICCode = BICCode;
	}

	public String getCorrespondent() {
		return Correspondent;
	}

	public void setCorrespondent(String Correspondent) {
		this.Correspondent = Correspondent;
	}

	public String getNostroAcNum() {
		return NostroAcNum;
	}

	public void setNostroAcNum(String NostroAcNum) {
		this.NostroAcNum = NostroAcNum;
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
		return "Cutomer [BankId=" + BankId + ", BankName=" + BankName
				+ ", BankAddress=" + BankAddress + ", BICCode=" + BICCode + ",NostroAcNum=" + NostroAcNum + ", ImportLCExposureLimit=" + ImportLCExposureLimit
				+ ", ExportLCExposureLimit=" + ExportLCExposureLimit + ", GuaranteeExposureLimit=" + GuaranteeExposureLimit 	+ "]";
	}
}
