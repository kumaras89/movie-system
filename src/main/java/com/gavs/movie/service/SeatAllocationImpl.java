package com.gavs.movie.service;

import com.gavs.movie.mapping.Seat;
import com.gavs.movie.mapping.SeatAllocationPrimaryKey;
import com.gavs.movie.repository.SeatRepository;
import com.gavs.movie.request.SeatAllocationRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class SeatAllocationImpl implements SeatAllocation {

    @Autowired
    SeatRepository setRep;

    @Override
    public List<Seat> getSeats() {
        List<Seat> seats = setRep.findAll();
        return seats;
    }

    @Override
    public Seat allocateSeat(SeatAllocationRequest seatAllocationRequest) {
        String userId = seatAllocationRequest.getBookingUserId();
        Integer movieId = seatAllocationRequest.getMovieId();
        Integer showId = seatAllocationRequest.getShowId();
        Integer seatNo = seatAllocationRequest.getSeatNo();
        Seat seat = new Seat();
        seat.setAllocatedTo(userId);
        seat.setMovieId(movieId);
        seat.setShowId(showId);
        seat.setSeatNo(seatNo);
        Seat savedSeat = setRep.saveAndFlush(seat);
        return savedSeat;
    }


}
