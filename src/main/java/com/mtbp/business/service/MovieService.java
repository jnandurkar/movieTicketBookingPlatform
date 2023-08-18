package com.mtbp.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtbp.data.entity.Movie;
import com.mtbp.data.repository.MovieRepository;

@Service
public class MovieService {
	 @Autowired
	    private MovieRepository movieRepository;

	    public List<Movie> getAllMovies() {
	        return (List<Movie>) movieRepository.findAll();
	    }

	    public Movie createMovie(Movie movie) {
	        return movieRepository.save(movie);
	    }
}
