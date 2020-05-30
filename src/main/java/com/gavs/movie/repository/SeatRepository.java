package com.gavs.movie.repository;

import com.gavs.movie.mapping.Seat;
import com.gavs.movie.mapping.SeatAllocationPrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Column;
import javax.persistence.Id;

@Repository
public interface SeatRepository extends JpaRepository<Seat, SeatAllocationPrimaryKey> , CrudRepository<Seat,SeatAllocationPrimaryKey> {

}
