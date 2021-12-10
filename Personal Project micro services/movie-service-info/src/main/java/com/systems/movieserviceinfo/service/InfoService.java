package com.systems.movieserviceinfo.service;

import java.util.List;

import com.systems.movieserviceinfo.entity.AboutMovies;
public interface InfoService {
	
	public List<AboutMovies> showAllMovies();

	public AboutMovies addMovie(AboutMovies movie);
	
	public AboutMovies findRecord(long id);
	

}
