package com.mvs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mvs.entity.Movie;

public interface MovieRepo extends JpaRepository<Movie,Integer> {

	List<Movie> findAllByName(String name);
	
}
