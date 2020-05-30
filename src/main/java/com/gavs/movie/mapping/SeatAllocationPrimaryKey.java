package com.gavs.movie.mapping;

import sun.print.resources.serviceui_it;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;


public class SeatAllocationPrimaryKey implements Serializable {

        private Integer movieId;

        private Integer showId;

        private Integer seatNo;

        public SeatAllocationPrimaryKey() {

        }

        public SeatAllocationPrimaryKey(Integer movieId, Integer showId, Integer seatNo) {
            this.movieId = movieId;
            this.showId = showId;
            this.seatNo = seatNo;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SeatAllocationPrimaryKey that = (SeatAllocationPrimaryKey) o;
        return Objects.equals(movieId, that.movieId) &&
                Objects.equals(showId, that.showId) &&
                Objects.equals(seatNo, that.seatNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId, showId, seatNo);
    }
}
