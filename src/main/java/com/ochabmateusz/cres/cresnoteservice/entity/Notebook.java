package com.ochabmateusz.cres.cresnoteservice.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;



public class Notebook {

	@Id
	@Getter
	
	private UUID id;

	@Getter
	@Column(name = "name")
	private String name;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notebook", cascade = CascadeType.ALL)
	@JsonIgnore
	@Getter
	private List<Note> notes;

	protected Notebook() {
		this.id = UUID.randomUUID();
		this.notes = new ArrayList<>();
	}

	public Notebook(String name) {
		this();
		this.name = name;
	}

	public Notebook(String id, String name) {
		this();
		if (id != null) {
			this.id = UUID.fromString(id);
		}
		this.name = name;
	}

}
