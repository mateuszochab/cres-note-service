package com.ochabmateusz.cres.cresnoteservice.repository;

import com.ochabmateusz.cres.cresnoteservice.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Integer> {


	

}
