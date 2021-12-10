package com.systems.actors.actorservice.service;

import java.util.List;

import com.systems.actors.actorservice.entity.Actor;

public interface ActorService {
	public List<Actor> getActors();

	public Actor getActor(long actorId);

	public Actor addActor(Actor actor);
	
	public Actor deleteMovie(long actorId);
}
