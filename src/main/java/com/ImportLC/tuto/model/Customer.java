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
public class Customer {
	// @Id
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int CustomerId;
	@Column
	private String CustomerName;
	@Column
	private String CustomerAddress;
	@Column
	private char Constitution;
	@Column
	private Date DateofIncorporation;
	@Column
	private String ContactDetailsName1;
	@Column
	private String ContactDetailsName2;
	@Column
	private String ContactDetailsEmailId1;
	@Column
	private String ContactDetailsEmailId2;
	@Column
	private String ImportExportLicenseIdentifier;
	@Column
	private Date ExpiryDateOfLicense;
	@Column
	private String SettlementAccountsPayments;
	@Column
	private String SettlementAccountsMargin;
	@Column
	private String SettlementAccountsCharges;
	@Column
	private String LiabilityAccountsImportLC;
	@Column
	private String LiabilityAccountsNumberforBankGuarantee;
	@Column
	private String LiabilityAccountsImportLCbill;
	@Column
	private String LiabilityAccountMarginLC;
	@Column
	private String LiabilityAccountMarginBG;

	public Customer(int CustomerId, String CustomerName,
			String CustomerAddress, char Constitution,
			Date DateofIncorporation, String ContactDetailsName1,
			String ContactDetailsName2, String ContactDetailsEmailId1,
			String ContactDetailsEmailId2,
			String ImportExportLicenseIdentifier, Date ExpiryDateOfLicense,
			String SettlementAccountsPayments, String SettlementAccountsMargin,
			String SettlementAccountsCharges, String LiabilityAccountsImportLC,
			String LiabilityAccountsNumberforBankGuarantee,
			String LiabilityAccountsImportLCbill,
			String LiabilityAccountMarginLC, String LiabilityAccountMarginBG) {
		super();
		this.CustomerId = CustomerId;
		this.CustomerName = CustomerName;
		this.CustomerAddress = CustomerAddress;
		this.Constitution = Constitution;
		this.DateofIncorporation = DateofIncorporation;
		this.ContactDetailsName1 = ContactDetailsName1;
		this.ContactDetailsName2 = ContactDetailsName2;
		this.ContactDetailsEmailId1 = ContactDetailsEmailId1;
		this.ContactDetailsEmailId2 = ContactDetailsEmailId2;
		this.ImportExportLicenseIdentifier = ImportExportLicenseIdentifier;
		this.ExpiryDateOfLicense = ExpiryDateOfLicense;
		this.SettlementAccountsPayments = SettlementAccountsPayments;
		this.SettlementAccountsMargin = SettlementAccountsMargin;
		this.SettlementAccountsCharges = SettlementAccountsCharges;
		this.LiabilityAccountsImportLC = LiabilityAccountsImportLC;
		this.LiabilityAccountsNumberforBankGuarantee = LiabilityAccountsNumberforBankGuarantee;
		this.LiabilityAccountsImportLCbill = LiabilityAccountsImportLCbill;
		this.LiabilityAccountMarginLC = LiabilityAccountMarginLC;
		this.LiabilityAccountMarginBG = LiabilityAccountMarginBG;
	}

	public Customer() {
		super();
	}

	public int getCustomerId() {
		return CustomerId;
	}

	public void setCustomerId(int CustomerId) {
		this.CustomerId = CustomerId;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public void setCustomerName(String CustomerName) {
		this.CustomerName = CustomerName;
	}

	public String getCustomerAddress() {
		return CustomerAddress;
	}

	public void setCustomerAddress(String CustomerAddress) {
		this.CustomerAddress = CustomerAddress;
	}

	public char getConstitution() {
		return Constitution;
	}

	public void setConstitution(char Constitution) {
		this.Constitution = Constitution;
	}

	public Date getDateofIncorporation() {
		return DateofIncorporation;
	}

	public void setDateofIncorporation(Date DateofIncorporation) {
		this.DateofIncorporation = DateofIncorporation;
	}

	public String getContactDetailsName1() {
		return ContactDetailsName1;
	}

	public void setContactDetailsName1(String ContactDetailsName1) {
		this.ContactDetailsName1 = ContactDetailsName1;
	}

	public String getContactDetailsName2() {
		return ContactDetailsName2;
	}

	public void setContactDetailsName2(String ContactDetailsName2) {
		this.ContactDetailsName2 = ContactDetailsName2;
	}

	public String getContactDetailsEmailId1() {
		return ContactDetailsEmailId1;
	}

	public void setContactDetailsEmailId1(String ContactDetailsEmailId1) {
		this.ContactDetailsEmailId1 = ContactDetailsEmailId1;
	}

	public String getContactDetailsEmailId2() {
		return ContactDetailsEmailId2;
	}

	public void setContactDetailsEmailId2(String ContactDetailsEmailId2) {
		this.ContactDetailsEmailId2 = ContactDetailsEmailId2;
	}

	public String getImportExportLicenseIdentifier() {
		return ImportExportLicenseIdentifier;
	}

	public void setImportExportLicenseIdentifier(
			String ImportExportLicenseIdentifier) {
		this.ImportExportLicenseIdentifier = ImportExportLicenseIdentifier;
	}

	public Date getExpiryDateOfLicense() {
		return ExpiryDateOfLicense;
	}

	public void setExpiryDateOfLicense(Date ExpiryDateOfLicense) {
		this.ExpiryDateOfLicense = ExpiryDateOfLicense;
	}

	public String getSettlementAccountsPayments() {
		return SettlementAccountsPayments;
	}

	public void setSettlementAccountsPayments(String SettlementAccountsPayments) {
		this.SettlementAccountsPayments = SettlementAccountsPayments;
	}

	public String getSettlementAccountsMargin() {
		return SettlementAccountsMargin;
	}

	public void setSettlementAccountsMargin(String SettlementAccountsMargin) {
		this.SettlementAccountsMargin = SettlementAccountsMargin;
	}

	public String getSettlementAccountsCharges() {
		return SettlementAccountsCharges;
	}

	public void setSettlementAccountsCharges(String SettlementAccountsCharges) {
		this.SettlementAccountsCharges = SettlementAccountsCharges;
	}

	public String getLiabilityAccountsImportLC() {
		return LiabilityAccountsImportLC;
	}

	public void setLiabilityAccountsImportLC(String LiabilityAccountsImportLC) {
		this.LiabilityAccountsImportLC = LiabilityAccountsImportLC;
	}

	public String getLiabilityAccountsNumberforBankGuarantee() {
		return LiabilityAccountsNumberforBankGuarantee;
	}

	public void setLiabilityAccountsNumberforBankGuarantee(
			String LiabilityAccountsNumberforBankGuarantee) {
		this.LiabilityAccountsNumberforBankGuarantee = LiabilityAccountsNumberforBankGuarantee;
	}

	public String getLiabilityAccountsImportLCbill() {
		return LiabilityAccountsImportLCbill;
	}

	public void setLiabilityAccountsImportLCbill(
			String LiabilityAccountsImportLCbill) {
		this.LiabilityAccountsImportLCbill = LiabilityAccountsImportLCbill;
	}

	public String getLiabilityAccountMarginLC() {
		return LiabilityAccountMarginLC;
	}

	public void setLiabilityAccountMarginLC(String LiabilityAccountMarginLC) {
		this.LiabilityAccountMarginLC = LiabilityAccountMarginLC;
	}

	public String getLiabilityAccountMarginBG() {
		return LiabilityAccountMarginBG;
	}

	public void setLiabilityAccountMarginBG(String LiabilityAccountMarginBG) {
		this.LiabilityAccountMarginBG = LiabilityAccountMarginBG;
	}

	@Override
	public String toString() {
		return "Cutomer [CustomerId=" + CustomerId + ", CustomerName=" + CustomerName
				+ ", CustomerAddress=" + CustomerAddress + ", Constitution=" + Constitution + ",ContactDetailsName1=" + ContactDetailsName1 + ", ContactDetailsName2=" + ContactDetailsName2
				+ ", ContactDetailsEmailId1=" + ContactDetailsEmailId1 + ", ContactDetailsEmailId2=" + ContactDetailsEmailId2 + ", ImportExportLicenseIdentifier=" + ImportExportLicenseIdentifier + ", ExpiryDateOfLicense=" + ExpiryDateOfLicense
				+ ", SettlementAccountsPayments=" + SettlementAccountsPayments + ", SettlementAccountsMargin=" + SettlementAccountsMargin + ",SettlementAccountsCharges=" + SettlementAccountsCharges + ", LiabilityAccountsImportLC=" + LiabilityAccountsImportLC
				+ ", LiabilityAccountsNumberforBankGuarantee=" + LiabilityAccountsNumberforBankGuarantee + ", LiabilityAccountsImportLCbill=" + LiabilityAccountsImportLCbill + ",LiabilityAccountMarginLC=" + LiabilityAccountMarginLC + ", LiabilityAccountMarginBG=" + LiabilityAccountMarginBG
				+ "]";
	}
}
