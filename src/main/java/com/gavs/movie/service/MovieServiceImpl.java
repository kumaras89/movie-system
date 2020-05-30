package com.gavs.movie.service;

import com.gavs.movie.mapping.Movie;
import com.gavs.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl  implements MovieService {
    @Autowired
    MovieRepository movieRepo;
    @Override
    public List<Movie> get() {
        List<Movie> all = movieRepo.findAll();
        return all;
    }

    @Override
    public Movie get(Integer id) {
        Optional<Movie> item = movieRepo.findById(id);
        Movie movie = item.get();
        movie.getShows();
        return movie;
    }
}
