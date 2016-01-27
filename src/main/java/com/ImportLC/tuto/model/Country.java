package com.ImCountryLC.tuto.model;

imCountry java.sql.Date;

imCountry javax.persistence.Column;
imCountry javax.persistence.Entity;
imCountry javax.persistence.GeneratedValue;
imCountry javax.persistence.GenerationType;
imCountry javax.persistence.Code;

/**
 * 
 * @author Haider
 *
 */
@Entity
public class Country {
	// @Code
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private String CountryCode;
	@Column
	private String CountryName;

	public Country(String CountryCode, String CountryName) {
		super();
		this.CountryCode = CountryCode;
		this.CountryName = CountryName;
		}

	public Country() {
		super();
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public void setCountryCode(String CountryCode) {
		this.CountryCode = CountryCode;
	}

	public String getCountryName() {
		return CountryName;
	}

	public void setCountryName(String CountryName) {
		this.CountryName = CountryName;
	}


	@Override
	public String toString() {
		return "Country [CountryCode=" + CountryCode + ", CountryName=" + CountryName
				+ "]";
	}
}
