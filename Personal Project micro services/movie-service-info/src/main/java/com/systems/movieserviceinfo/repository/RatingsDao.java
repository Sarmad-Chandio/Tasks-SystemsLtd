package com.systems.movieserviceinfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.systems.movieserviceinfo.entity.MoviesRating;

public interface RatingsDao extends JpaRepository<MoviesRating, Long>{

}
