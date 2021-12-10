package com.systems.movieservicecatalog.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
//	@JoinTable(name="movie_Ratings",joinColumns = @JoinColumn(name="movieId", referencedColumnName = "movieId"), inverseJoinColumns = @JoinColumn(name="movieRatingId", referencedColumnName = "movieRatingId"))
	@JsonIgnoreProperties(value = "rating")
	@JoinColumn(name = "movieId")
	AboutMovies movie;

	public MoviesRating() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public MoviesRating(Long movieRatingId, double movieRating, long business, AboutMovies movie) {
		super();
		this.movieRatingId = movieRatingId;
		this.movieRating = movieRating;
		this.business = business;
		this.movie = movie;
	}



	public AboutMovies getMovie() {
		return movie;
	}



	public void setMovie(AboutMovies movie) {
		this.movie = movie;
	}



	public Long getMovieRatingId() {
		return movieRatingId;
	}

	public void setMovieRatingId(Long movieRatingId) {
		this.movieRatingId = movieRatingId;
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

	
	
}
