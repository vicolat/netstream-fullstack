package com.netstream.backend.service;

import com.netstream.backend.dto.MovieDTO;
import com.netstream.backend.model.Movie;
import com.netstream.backend.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    // Constructor injection
    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    // CREATE MOVIE
    public Movie addMovie(MovieDTO dto) {
        System.out.println("DTO trailerUrl: " + dto.getTrailerUrl());
        System.out.println("DTO posterUrl: " + dto.getPosterUrl());
       
        Movie movie = new Movie();

        movie.setTitle(dto.getTitle());
        movie.setGenre(dto.getGenre());
        movie.setTrailerUrl(dto.getTrailerUrl());
        movie.setPosterUrl(dto.getPosterUrl());

        return movieRepository.save(movie);
    }

    // GET ALL MOVIES
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    // GET MOVIE BY ID
    public Movie getMovieById(String id) {
        return movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    // UPDATE MOVIE
    public Movie updateMovie(String id, MovieDTO dto) {

        Movie movie = movieRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Movie not found"));

        movie.setTitle(dto.getTitle());
        movie.setGenre(dto.getGenre());
        movie.setTrailerUrl(dto.getTrailerUrl());
        movie.setPosterUrl(dto.getPosterUrl());

        return movieRepository.save(movie);
    }

    // DELETE MOVIE
    public void deleteMovie(String id) {
        movieRepository.deleteById(id);
    }
}