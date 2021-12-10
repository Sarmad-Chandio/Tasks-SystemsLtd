package com.systems.movieservicecatalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.systems.movieservicecatalog.entity.MoviesRating;

public interface MovieDao extends JpaRepository<MoviesRating, Long>{
	/*
	 *  extends JpaRepository<T, ID>
	 * t->on which entity you are going to perform operation
	 * Id-->shows "TYPE" of primary key 
	 * 
	 * And there is no need to implement this interface because it's implementation is being provided by jpa itself
	 * 
	 * */
	@Query(nativeQuery=true, value="select * from rating where movie_id=?1")
	public MoviesRating findMoviesRatingByMovieId(String movieId);

	@Query(nativeQuery=true, value="select * from movie where id =(select rating_id from movie_rating where movie_id= ?1 ) ")
	public MoviesRating getMovie(Long id);

}