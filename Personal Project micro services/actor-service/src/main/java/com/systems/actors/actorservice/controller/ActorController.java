package com.systems.actors.actorservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.systems.actors.actorservice.entity.Actor;
import com.systems.actors.actorservice.service.ActorService;

@RestController
@RequestMapping("/actors")
public class ActorController {
	
	@Autowired
	ActorService actorService;
	
	@GetMapping("/actor")
	public List<Actor> showList(){
		
		return this.actorService.getActors();
	}
	
	@GetMapping("/actor/{id}")
	public Actor getActor(@PathVariable String id) {
		return this.actorService.getActor(Long.parseLong(id));
	}
	@PostMapping("/actor")
	public Actor addActor(@RequestBody Actor actor) {	
		
		return actorService.addActor(actor);
	}
	@DeleteMapping("/actor/{id}")
	public ResponseEntity<HttpStatus> deleteMovie(@PathVariable String id){
		try {
			this.actorService.deleteMovie(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
