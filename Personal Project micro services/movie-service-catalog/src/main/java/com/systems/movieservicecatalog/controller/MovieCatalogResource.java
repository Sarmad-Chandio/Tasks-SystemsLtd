package com.systems.movieservicecatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.systems.movieservicecatalog.entity.MoviesRating;
import com.systems.movieservicecatalog.service.MoviesService;

@RestController
@RequestMapping("/ratings")
public class MovieCatalogResource { //MyController
	
	//injecting object
	@Autowired
	private MoviesService moviesService;
	
	@GetMapping("/movies")
	public List<MoviesRating> showList(){
		return this.moviesService.getMovies();
	}
	//we are getting any particular record from catalog service
	@GetMapping("/movies/{movieId}")
	public MoviesRating getMovie(@PathVariable String movieId ) {	
		return moviesService.getMovieRating(movieId);
	
	}

	

	
	
}
