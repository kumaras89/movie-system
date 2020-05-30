package com.gavs.movie.controller;

import com.gavs.movie.mapping.Movie;
import com.gavs.movie.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieService;
    @GetMapping(value ="/movies" )
    public List<Movie> get() {
        List<Movie> movies =  movieService.get();
        return movies;
    }

    @GetMapping(value ="/movies/{id}" )
    public Movie get(@PathVariable Integer id) {
        Movie movie =  movieService.get(id);
        return movie;
    }


}
