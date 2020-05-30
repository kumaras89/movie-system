package com.gavs.movie.mapping;

import javax.persistence.*;
import java.util.Date;

@Table(name = "seat_allocation")
@Entity
@IdClass(SeatAllocationPrimaryKey.class)
public class Seat {
    @Id
    @Column( name = "movie_id", updatable= false)
    private Integer movieId;
    @Id
    @Column( name = "show_id", updatable= false)
    private Integer showId;
    @Id
    @Column( name = "seat_no", updatable= false)
    private Integer seatNo;
    @Column( name = "allocated_to", updatable= false)
    private String allocatedTo;

//    private Date createdTime;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getShowId() {
        return showId;
    }

    public void setShowId(Integer showId) {
        this.showId = showId;
    }

    public Integer getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(Integer seatNo) {
        this.seatNo = seatNo;
    }

    public String getAllocatedTo() {
        return allocatedTo;
    }

    public void setAllocatedTo(String allocatedTo) {
        this.allocatedTo = allocatedTo;
    }
}
