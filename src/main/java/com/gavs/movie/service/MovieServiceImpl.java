package com.gavs.movie.service;

import com.gavs.movie.mapping.Movie;
import com.gavs.movie.mapping.Show;
import com.gavs.movie.repository.MovieRepository;
import com.gavs.movie.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class MovieServiceImpl  implements MovieService {
    @Autowired
    MovieRepository movieRepo;
    @Autowired
    ShowRepository showRepo;

    @Override
    public List<Movie> get() {
        List<Movie> all = movieRepo.findAll();
        return all;
    }

    @Override
    public Movie get(Integer id) {
        Optional<Movie> item = movieRepo.findById(id);
        Movie movie = item.get();
        List<Show> shows = showRepo.findByMovieId(id);
        movie.setShows(shows);

        return movie;
    }
}
