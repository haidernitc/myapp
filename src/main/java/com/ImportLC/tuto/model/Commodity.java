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
public class Commodity {
	@Column
	private String CommodityCode;
	@Column
	private String CommodityDescription;
	@Column
	private String RestrictedCommodity;
	@Column
	private String RestrictionType;

	public Commodity(String CommodityCode,
			String CommodityDescription, 
	 String RestrictedCommodity,
	
	 String RestrictionType) {
		super();
		this.CommodityCode = CommodityCode;
		this.CommodityDescription = CommodityDescription;
		this.RestrictedCommodity = RestrictedCommodity;
		this.RestrictionType = RestrictionType;
	}

	public Commodity() {
		super();
	}

	public String getCommodityCode() {
		return CommodityCode;
	}

	public void setCommodityCode(String CommodityCode) {
		this.CommodityCode = CommodityCode;
	}

	public String getCommodityDescription() {
		return CommodityDescription;
	}

	public void setCommodityDescription(String CommodityDescription) {
		this.CommodityDescription = CommodityDescription;
	}

	public double getRestrictedCommodity() {
		return RestrictedCommodity;
	}

	public void setRestrictedCommodity(String RestrictedCommodity) {
		this.RestrictedCommodity = RestrictedCommodity;
	}

	public double getRestrictionType() {
		return RestrictionType;
	}

	public void setRestrictionType(String RestrictionType) {
		this.RestrictionType = RestrictionType;
	}


	@Override
	public String toString() {
		return "Commodity [CommodityCode=" + CommodityCode
				+ ", CommodityDescription=" + CommodityDescription + ", RestrictedCommodity=" + RestrictedCommodity
				+ ", RestrictionType=" + RestrictionType + "]";
	}
}
