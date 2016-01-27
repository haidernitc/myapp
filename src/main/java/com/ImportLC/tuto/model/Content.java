package com.ImContentLC.tuto.model;

imContent java.sql.Date;

imContent javax.persistence.Column;
imContent javax.persistence.Entity;
imContent javax.persistence.GeneratedValue;
imContent javax.persistence.GenerationType;
imContent javax.persistence.Code;

/**
 * 
 * @author HaCodeer
 *
 */
@Entity
public class Content {
	// @Code
	@Column
         private String Module;
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private String ContentName;
	@Column
	private String ContentDescription;

	public Content(String Module,String ContentName, String ContentDescription) {
		super();
		this.Module = Module;
		this.ContentName = ContentName;
		this.ContentDescription = ContentDescription;
		}

	public Content() {
		super();
	}

	public String getModule() {
		return Module;
	}

	public void setModule(String Module) {
		this.Module = Module;
	}

	public String getContentName() {
		return ContentName;
	}

	public void setContentName(String ContentName) {
		this.ContentName = ContentName;
	}

	public String getContentDescription() {
		return ContentDescription;
	}

	public void setContentDescription(String ContentDescription) {
		this.ContentDescription = ContentDescription;
	}


	@Override
	public String toString() {
		return "Content [Module=" + Module + ",ContentName=" + ContentName + ", ContentDescription=" + ContentDescription
				+ "]";
	}
}
