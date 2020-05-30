package com.gavs.movie.service;

import com.gavs.movie.mapping.Seat;
import com.gavs.movie.request.SeatAllocationRequest;

import java.util.List;

public interface SeatAllocation {
    List<Seat> getSeats();
    Seat allocateSeat(SeatAllocationRequest seatAllocationRequest);
}
