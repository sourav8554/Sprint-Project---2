package com.mvs.service;

import java.util.List;



import com.mvs.entity.Movie;

public interface MovieService{
	public Movie saveMovie(Movie movie);
	public List<Movie> getMovies();
	public Movie getMovieById(int id);
	public List<Movie> getMovieListByName(String name);
	public Movie updateMovie(Movie movie);
	public String deleteMovie(int id);
}
