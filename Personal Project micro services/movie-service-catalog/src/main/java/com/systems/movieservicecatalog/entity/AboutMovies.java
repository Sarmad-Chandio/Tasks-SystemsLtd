package com.systems.movieservicecatalog.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="movie")
public class AboutMovies {
	@Id
	private Long movieId;
	private String movieName;
	private String description;
	
	@OneToOne(mappedBy="movie")
	MoviesRating rating;

	public AboutMovies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AboutMovies(Long movieId, String movieName, String description, MoviesRating rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
		this.rating = rating;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MoviesRating getRating() {
		return rating;
	}

	public void setRating(MoviesRating rating) {
		this.rating = rating;
	}

	
	

}
