package com.gavs.movie.repository;

import com.gavs.movie.mapping.Show;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShowRepository extends JpaRepository<Show, Integer>, CrudRepository<Show, Integer>  {

    List<Show> findByMovieId(Integer movieId);
}
