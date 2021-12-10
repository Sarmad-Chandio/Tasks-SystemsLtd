package com.systems.movieserviceinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.systems.movieserviceinfo.entity.AboutMovies;
import com.systems.movieserviceinfo.entity.Actor;

public interface MovieDao extends JpaRepository<AboutMovies, Long>{

//	@Query(nativeQuery=true, value="select * from rating where id =(select movie_id from movie_rating where movie_id= ?1 ) ")
//	public MoviesRating moviesRating(Long id);

	
}
