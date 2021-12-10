package com.systems.movieserviceinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.systems.movieserviceinfo.entity.Actor;

public interface ActorDao extends JpaRepository<Actor, Long>{
	
	
//	@Query(nativeQuery=true,value="select actor_id from actor_movie where movie_Id=?)")
//	public Actor actorId(Long id);
	
}
