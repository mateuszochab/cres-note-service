package com.ochabmateusz.cres.cresnoteservice.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ochabmateusz.cres.cresnoteservice.entity.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, UUID> {


	

}
