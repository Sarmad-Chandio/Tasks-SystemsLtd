package com.systems.movieserviceinfo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.systems.movieserviceinfo.entity.AboutMovies;
import com.systems.movieserviceinfo.entity.Actor;
import com.systems.movieserviceinfo.entity.MoviesRating;
import com.systems.movieserviceinfo.service.InfoService;

@RestController
@RequestMapping("/movies")
public class InformationAboutMovies {
	@Autowired
	InfoService info;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/about")
	public List<AboutMovies> showAllMovies(){
		return this.info.showAllMovies();
	}
	//call movie with Ratings
	@GetMapping("/about/{movieId}")
	public AboutMovies showMovieDiscription(@PathVariable Long movieId ) {	
		
		AboutMovies movie=this.info.findRecord(movieId);
		
		//=new MoviesRating();
		 
		//http://localhost:8080/ratings/movies/1 MoviesRating
		 
		MoviesRating moviesRating=this.restTemplate.getForObject( "http://localhost:8080/ratings/movies/"+movie.getMovieId(),MoviesRating.class); 
		movie.setMovieRating(Arrays.asList(moviesRating));
		
		return movie;
		 
		 /*
		 ** 
		 * Actor
		 * actor=this.restTemplate.getForObject("http://localhost:8084/actors/actor/"+
		 * movie.getMovieId(), Actor.class);
		 * actorMovieRating.setMovieRating(moviesRating);
		 * actorMovieRating.setActor(actor);
		 * 
		 * return actorMovieRating;
		 */
	}
	
	
	@PostMapping("/about")
	public AboutMovies addMovie(@RequestBody AboutMovies movie) {
		System.out.println(this.info.addMovie(movie));
		return this.info.addMovie(movie);
	}
	

}
