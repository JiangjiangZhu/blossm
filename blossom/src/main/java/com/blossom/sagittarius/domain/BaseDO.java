package com.blossom.sagittarius.domain;

import java.sql.Timestamp;

public class BaseDO {
	
	private String creator;
	
	private String modifier;
	
	private Timestamp dateCreate;
	
	private Timestamp dateUpdate;
	
	private Timestamp dateDelete;

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getModifier() {
		return modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public Timestamp getDateCreate() {
		return dateCreate;
	}

	public void setDateCreate(Timestamp dateCreate) {
		this.dateCreate = dateCreate;
	}

	public Timestamp getDateUpdate() {
		return dateUpdate;
	}

	public void setDateUpdate(Timestamp dateUpdate) {
		this.dateUpdate = dateUpdate;
	}

	public Timestamp getDateDelete() {
		return dateDelete;
	}

	public void setDateDelete(Timestamp dateDelete) {
		this.dateDelete = dateDelete;
	}

}
