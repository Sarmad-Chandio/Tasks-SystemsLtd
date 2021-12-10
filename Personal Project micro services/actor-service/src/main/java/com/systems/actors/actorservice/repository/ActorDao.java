package com.systems.actors.actorservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.systems.actors.actorservice.entity.Actor;


@Repository
public interface ActorDao extends JpaRepository<Actor, Long>{
	
//	@Query(nativeQuery=true, value="select * from rating where id =(select movie_id from movie_rating where movie_id= ?1 ) ")
//	public MoviesRating moviesRating(Long id);
	
}
