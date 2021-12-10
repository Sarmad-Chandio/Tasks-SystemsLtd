package com.systems.actors.actorservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systems.actors.actorservice.entity.Actor;
import com.systems.actors.actorservice.repository.ActorDao;
@Service
public class ActorServiceImpl implements ActorService{
	
	@Autowired
	ActorDao actorDao;
	
	
	public List<Actor> getActors() {
		List<Actor> listActor=actorDao.findAll();
		return listActor;
	}

	@Override
	public Actor getActor(long actorId) {
		
		return actorDao.findById(actorId).get();
	}

	@Override
	public Actor addActor(Actor actor) {
		
		return actorDao.save(actor);
	}

	@Override
	public Actor deleteMovie(long actorId) {
		//Movies record=movieDao.getOne(movieId);
		Actor entity=actorDao.findById(actorId).get();
		//movieDao.delete(record);
		actorDao.delete(entity);
		return entity;
	}
	
}
