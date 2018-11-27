package com.ochabmateusz.cres.cresnoteservice.controller;

import com.ochabmateusz.cres.cresnoteservice.entity.ArrivingNote;
import com.ochabmateusz.cres.cresnoteservice.entity.Id_request;
import com.ochabmateusz.cres.cresnoteservice.entity.Note;
import com.ochabmateusz.cres.cresnoteservice.entity.User;
import com.ochabmateusz.cres.cresnoteservice.repository.NoteRepository;
import com.ochabmateusz.cres.cresnoteservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@CrossOrigin
@RestController
public class MainController {
	private static final Logger LOGGER = Logger.getLogger(MainController.class.getName());
	@Autowired
	private NoteRepository noteRepository;

	@Autowired
	private UserRepository userRepository;

	// add new post
	@PostMapping("/add")
	public void createNewPost(@RequestBody ArrivingNote arrivingNote) {
		int id = arrivingNote.getId();
		String message = arrivingNote.getMessage();
		LOGGER.info("Read value id "+ id+" ,and message: "+message);
		User user = new User();
		user = userRepository.getOne(id);
		LOGGER.info("Read value name "+ user.getName()+" ,and email: "+user.getEmail());
		Note newNote = new Note(message, user);
//		user.setNotes(new HashSet<Note>() {{
//			add(newNote);
//		}});

		noteRepository.save(newNote);

	}

	//delete post
	@GetMapping("/remove")
	public void deletePost(@RequestBody  Id_request id_request) {


	}

//	//modify post
//	@GetMapping("/edit")
//
	//get all post
	@GetMapping("/getnotes")
	public List<Note> getAllNotes(@RequestBody Id_request id_request){
		//List<Note>
		//Id_request id_r=new Id_request(id_request.getId());
		//LOGGER.info("Read value id "+ id_request.getId());
		User user=new User();
		user=userRepository.getOne(id_request.getId());

		List<Note> allNotes=user.getNotes();
		//LOGGER.info("size of notes"+allNotes.size());
		return allNotes;


	}


}
