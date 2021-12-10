package com.systems.movieserviceinfo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name="movie")
public class AboutMovies {
	@Id
	private Long movieId;
	private String movieName;
	private String description;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "actors_movies",joinColumns = @JoinColumn(name = "movieId", referencedColumnName = "movieId"), inverseJoinColumns = @JoinColumn(name = "actorId", referencedColumnName = "actorId"))
	@JsonIgnoreProperties(value = "listOfMovie")
	List<Actor> listOfActors;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "rating",joinColumns = @JoinColumn(name = "movieId", referencedColumnName = "movieId"), inverseJoinColumns = @JoinColumn(name = "movieRatingId", referencedColumnName = "movieRatingId"))
	@JsonIgnoreProperties(value = "movieRating")
	List<MoviesRating> movieRating;

	public AboutMovies() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AboutMovies(Long movieId, String movieName, String description, List<Actor> listOfActors,
			List<MoviesRating> movieRating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.description = description;
		this.listOfActors = listOfActors;
		this.movieRating = movieRating;
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

	public List<Actor> getListOfActors() {
		return listOfActors;
	}

	public void setListOfActors(List<Actor> listOfActors) {
		this.listOfActors = listOfActors;
	}

	public List<MoviesRating> getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(List<MoviesRating> movieRating) {
		this.movieRating = movieRating;
	}
}
