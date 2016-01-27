package com.ImCurrencyLC.tuto.model;

imCurrency java.sql.Date;

imCurrency javax.persistence.Column;
imCurrency javax.persistence.Entity;
imCurrency javax.persistence.GeneratedValue;
imCurrency javax.persistence.GenerationType;
imCurrency javax.persistence.Code;

/**
 * 
 * @author Haider
 *
 */
@Entity
public class Currency {
	// @Code
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private String CurrencyCode;
	@Column
	private String CurrencyName;

	public Currency(String CurrencyCode, String CurrencyName) {
		super();
		this.CurrencyCode = CurrencyCode;
		this.CurrencyName = CurrencyName;
		}

	public Currency() {
		super();
	}

	public String getCurrencyCode() {
		return CurrencyCode;
	}

	public void setCurrencyCode(String CurrencyCode) {
		this.CurrencyCode = CurrencyCode;
	}

	public String getCurrencyName() {
		return CurrencyName;
	}

	public void setCurrencyName(String CurrencyName) {
		this.CurrencyName = CurrencyName;
	}


	@Override
	public String toString() {
		return "Currency [CurrencyCode=" + CurrencyCode + ", CurrencyName=" + CurrencyName
				+ "]";
	}
}
