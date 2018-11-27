package com.ochabmateusz.cres.cresnoteservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "note") @ToString
public class Note {

	@Getter
	@Id
	@Column(name = "id")
	private int id;

	@Getter
	@Setter
	@Column(name = "text")
	private String text;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "iduser_fk")
	@JsonBackReference
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
		//this.id = UUID.randomUUID();

	}

	public Note(String text, User user) {
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
