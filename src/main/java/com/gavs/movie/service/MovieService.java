package com.gavs.movie.service;


import com.gavs.movie.mapping.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> get();

    Movie get(Integer id);
}
