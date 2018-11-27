package com.ochabmateusz.cres.cresnoteservice.entity;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "note")
public class Note {

	@Getter
	@Id
	@Column(name = "id")
	private UUID id;

	@Getter
	@Setter
	@Column(name = "text")
	private String text;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser_fk")
	private User user;

//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "created_date", nullable = false, updatable = false)
//	@CreatedDate
//	private Date createdDate;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	@Column(name = "updated_date", nullable = false)
//	@LastModifiedDate
//	private Date updatedDate;

	protected Note() {
		this.id = UUID.randomUUID();

	}

	public Note(String text, User user) {
		this();
		this.text = text;
		this.user = user;

	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getUser() {
		return this.user;

	}

//	public String getNotebookId() {
//		return this.notebook.getId().toString();
//	}

}
