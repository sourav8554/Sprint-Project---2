package com.mvs.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mvs.entity.Movie;
import com.mvs.repository.MovieRepo;
import com.mvs.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieRepo movieRepo;
	public Movie saveMovie(Movie movie) {
		return movieRepo.save(movie);
	}
	public List<Movie> getMovies(){
		return movieRepo.findAll();
	}

	public Movie getMovieById(int id){
		return movieRepo.findById(id).orElse(null);
	}
	
	public List<Movie> getMovieListByName(String name){
		return movieRepo.findAllByName(name);
	}
	public Movie updateMovie(Movie movie) {
		Movie existingMovie=movieRepo.findById(movie.getId()).orElse(null);
		existingMovie.setName(movie.getName());
		existingMovie.setMultiplex(movie.getMultiplex());
		existingMovie.setTime(movie.getTime());
		existingMovie.setScreen(movie.getScreen());
		existingMovie.setSeat(movie.getSeat());
		existingMovie.setPrice(movie.getPrice());
		return movieRepo.save(existingMovie);
	}
	public String deleteMovie(int id) {
		movieRepo.deleteById(id);
		return "Deleted";
	}
}
