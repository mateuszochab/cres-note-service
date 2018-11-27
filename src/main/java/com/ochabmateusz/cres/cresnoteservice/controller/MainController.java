package com.ochabmateusz.cres.cresnoteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ochabmateusz.cres.cresnoteservice.entity.ArrivingNote;
import com.ochabmateusz.cres.cresnoteservice.entity.Note;
import com.ochabmateusz.cres.cresnoteservice.entity.User;
import com.ochabmateusz.cres.cresnoteservice.repository.NoteRepository;
import com.ochabmateusz.cres.cresnoteservice.repository.UserRepository;

@CrossOrigin
@RestController("/posts")
public class MainController {

	@Autowired
	private NoteRepository noteRepository;

	@Autowired
	private UserRepository userRepository;

	// add new post
	@PostMapping("/add/{i}")
	public void createNewPost(@PathVariable ArrivingNote arrivingNote) {
		Long id = arrivingNote.getId();
		String message = arrivingNote.getMessage();
		User user = new User();
		user = userRepository.getOne(id);

		Note newNote = new Note(message, user);
//		user.setNotes(new HashSet<Note>() {{
//			add(newNote);
//		}});

		noteRepository.save(newNote);

	}
//	//delete post
//	@GetMapping("/remove")
//	
//	
//	//modify post
//	@GetMapping("/edit")
//
//	//get all posts
//	@GetMapping("/getnotes")
//	public List<Note> getAllNotes(){
//	
//		List<Note> allNotes= 
//		
//		
//	}
//	

}
