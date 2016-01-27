package com.ImIncotermLC.tuto.model;

imIncoterm java.sql.Date;

imIncoterm javax.persistence.Column;
imIncoterm javax.persistence.Entity;
imIncoterm javax.persistence.GeneratedValue;
imIncoterm javax.persistence.GenerationType;
imIncoterm javax.persistence.Code;

/**
 * 
 * @author Haider
 *
 */
@Entity
public class Incoterm {
	// @Code
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int IncotermId;
	@Column
	private String IncotermName;

	public Incoterm(int IncotermId, String IncotermName) {
		super();
		this.IncotermCode = IncotermCode;
		this.IncotermName = IncotermName;
	}

	public Incoterm() {
		super();
	}

	public int getIncotermId() {
		return IncotermId;
	}

	public void setIncotermId(int IncotermId) {
		this.IncotermId = IncotermId;
	}

	public String getIncotermName() {
		return IncotermName;
	}

	public void setIncotermName(String IncotermName) {
		this.IncotermName = IncotermName;
	}



	@Override
	public String toString() {
		return "Incoterm [IncotermID=" + IncotermId + ", IncotermName=" + IncotermName
				+ "]";	}
}
