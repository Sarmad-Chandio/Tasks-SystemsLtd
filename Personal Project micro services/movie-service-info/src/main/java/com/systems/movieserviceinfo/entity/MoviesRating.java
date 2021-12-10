package com.systems.movieserviceinfo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="rating")
public class MoviesRating{
	@Id
	private Long movieRatingId;
	private double movieRating;
	private long business;
	
	@OneToOne
//	@JoinTable(name = "movie",joinColumns = @JoinColumn(name = "movieRatingId", referencedColumnName = "movieRatingId"), inverseJoinColumns = @JoinColumn(name = "movieId", referencedColumnName = "movieId"))
//	@JsonIgnoreProperties(value = "listOfMovies")
	List<AboutMovies> listOfMovies;

	public MoviesRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MoviesRating(Long movieId, double movieRating, long business, List<AboutMovies> listOfMovies) {
		super();
		this.movieRatingId = movieId;
		this.movieRating = movieRating;
		this.business = business;
		this.listOfMovies = listOfMovies;
	}

	public Long getMovieId() {
		return movieRatingId;
	}

	public void setMovieId(Long movieId) {
		this.movieRatingId = movieId;
	}

	public double getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(double movieRating) {
		this.movieRating = movieRating;
	}

	public long getBusiness() {
		return business;
	}

	public void setBusiness(long business) {
		this.business = business;
	}

	public List<AboutMovies> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<AboutMovies> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}
	
	

}
