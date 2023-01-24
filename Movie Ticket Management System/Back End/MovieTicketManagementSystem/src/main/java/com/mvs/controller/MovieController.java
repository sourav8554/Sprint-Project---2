package com.mvs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mvs.entity.Movie;
import com.mvs.service.MovieService;


@RestController
public class MovieController {
	@Autowired
	private MovieService movieservice;
	@PostMapping("/addmovie")
	public Movie addMovie(@RequestBody Movie movie) {
		return movieservice.saveMovie(movie);
	}
	@GetMapping("/getallmovies")
	public List<Movie> getMovies(){
		return movieservice.getMovies();
	}
	@GetMapping("/getmovie/{id}")
	public Object getMovieById(@PathVariable int id) {
		return movieservice.getMovieById(id);
	}
	@GetMapping("/getallmovie/{movieName}")
	public List<Movie> getMovieByName(@PathVariable String movieName) {
		return movieservice.getMovieListByName(movieName);
	}
	@PutMapping("/updatemovie")
	public Movie updateMovie(@RequestBody Movie movie) {
		return movieservice.updateMovie(movie);
	}
	@DeleteMapping("/deletemovie/{id}")
	public String deleteMovieByName(@PathVariable int id) {
		return movieservice.deleteMovie(id);
	}
}
