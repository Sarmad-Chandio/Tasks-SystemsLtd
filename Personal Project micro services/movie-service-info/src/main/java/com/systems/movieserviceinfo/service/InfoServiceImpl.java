package com.systems.movieserviceinfo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.systems.movieserviceinfo.entity.AboutMovies;
import com.systems.movieserviceinfo.repository.MovieDao;

@Service
public class InfoServiceImpl implements InfoService {
	
	@Autowired
	MovieDao moviesList;
	
	
	
	@Override
	public List<AboutMovies> showAllMovies() {
		
		return moviesList.findAll();
	}

	@Override
	public AboutMovies addMovie(AboutMovies movieId){
		return moviesList.save(movieId);
	}

	@Override
	public AboutMovies findRecord(long id) {
		AboutMovies tempData=null;
		try {
			tempData= moviesList.findById(id).get();
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}
		
		return tempData;
	}

//	@Override
//	public MoviesRating moviesRating(Long id) {
//		return moviesList.moviesRating(id);
//	}
//	
	
	
}
