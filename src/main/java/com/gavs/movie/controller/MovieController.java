package com.gavs.movie.controller;

import com.gavs.movie.mapping.Movie;
import com.gavs.movie.mapping.Seat;
import com.gavs.movie.service.MovieService;
import com.gavs.movie.service.SeatAllocation;
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
    public Response get() {
        List<Movie> movies =  movieService.get();
        Response response = new Response("200","success" ,movies);
        return response;
    }

    @GetMapping(value ="/movies/{id}" )
    public Response get(@PathVariable Integer id) {
        Movie movie =  movieService.get(id);
        Response response = new Response("200","success" ,movie);
        return response;
    }

}
