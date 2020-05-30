package com.gavs.movie.repository;

import com.gavs.movie.mapping.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer>, CrudRepository<Movie, Integer> {


}
