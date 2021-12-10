package com.systems.movieservicecatalog.service;

import java.util.List;

import com.systems.movieservicecatalog.entity.MoviesRating;

public interface MoviesService {
	
	public List<MoviesRating> getMovies();

	public MoviesRating getRating(long ratingId);
	
	public MoviesRating getMovieRating(String movieId);
	
	public MoviesRating addMovie(MoviesRating rating);
	
	public void deleteMovie(long movieId);
	public MoviesRating moviesRating(Long id);
}
