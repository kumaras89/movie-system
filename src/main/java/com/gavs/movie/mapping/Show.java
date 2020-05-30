package com.gavs.movie.mapping;

import javax.persistence.*;

@Table(name = "show")
@Entity
public class Show {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column( name = "id")
    private Long id;
    @Column( name = "screen_name")
    private String screeName;
    @Column( name = "movie_id")
    private Integer movieId;
    @Column( name = "show_timing")
    private String showTiming;
    @Column( name = "seat_count")
    private Integer totalSeat;
    @Column( name = "avilable_seat")
    private Integer availableSeat;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "movie_id")
//    private Movie movie;

    public String getScreeName() {
        return screeName;
    }

    public void setScreeName(String screeName) {
        this.screeName = screeName;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getShowTiming() {
        return showTiming;
    }

    public void setShowTiming(String showTiming) {
        this.showTiming = showTiming;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTotalSeat() {
        return totalSeat;
    }

    public void setTotalSeat(Integer totalSeat) {
        this.totalSeat = totalSeat;
    }

    public Integer getAvailableSeat() {
        return availableSeat;
    }

    public void setAvailableSeat(Integer availableSeat) {
        this.availableSeat = availableSeat;
    }

    //
//    public Movie getMovie() {
//        return movie;
//    }
//
//    public void setMovie(Movie movie) {
//        this.movie = movie;
//    }
}
