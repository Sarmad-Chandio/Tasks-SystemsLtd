package com.systems.movieservicecatalog.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.systems.movieservicecatalog.entity.MoviesRating;
import com.systems.movieservicecatalog.repository.MovieDao;
@Service
public class MoviesServiceImpl implements MoviesService{
	
	
	@Autowired
	private MovieDao movieDao;
	
	
	public List<MoviesRating> getMovies() {		
		return movieDao.findAll();	
	}

	@Override
	public MoviesRating getMovieRating(String movieId) {
		MoviesRating m = movieDao.findMoviesRatingByMovieId(movieId);
		return m;
	}

	@Override
	public MoviesRating addMovie(MoviesRating movie) {
		return movieDao.save(movie);
	}

	@Override
	public void deleteMovie(long movieId) {
		MoviesRating record=movieDao.getOne(movieId);
		movieDao.delete(record);
				
	}

	@Override
	public MoviesRating moviesRating(Long id) {
		return movieDao.getMovie(id);
		
	}

	@Override
	public MoviesRating getRating(long ratingId) {
		// TODO Auto-generated method stub
		return null;
	}


}
