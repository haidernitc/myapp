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
public class Document {
	// @Id
	@Column
	// @GeneratedValue(strategy=GenerationType.AUTO) //for autoincrement
	private int DocumentId;
	@Column
	private String DocumentName;
	@Column
	private String DocumentDescription;

	public Document(int DocumentId, String DocumentName,
			String DocumentDescription) {
		super();
		this.DocumentId = DocumentId;
		this.DocumentName = DocumentName;
		this.DocumentDescription = DocumentDescription;
	}

	public Document() {
		super();
	}

	public int getDocumentId() {
		return DocumentId;
	}

	public void setDocumentId(int DocumentId) {
		this.DocumentId = DocumentId;
	}

	public String getDocumentName() {
		return DocumentName;
	}

	public void setDocumentName(String DocumentName) {
		this.DocumentName = DocumentName;
	}

	public String getDocumentDescription() {
		return DocumentDescription;
	}

	public void setDocumentDescription(String DocumentDescription) {
		this.DocumentDescription = DocumentDescription;
	}


	@Override
	public String toString() {
		return "Cutomer [DocumentId=" + DocumentId + ", DocumentName=" + DocumentName
				+ ", DocumentDescription=" + DocumentDescription + "]";
	}
}
