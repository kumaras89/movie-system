package com.gavs.movie.controller;

import com.gavs.movie.mapping.Seat;
import com.gavs.movie.request.SeatAllocationRequest;
import com.gavs.movie.service.SeatAllocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeatController {

    @Autowired
    SeatAllocation seatAllocater;

    @GetMapping(value ="/seats" )
    public Response get() {
        List<Seat> seats =  seatAllocater.getSeats();
        Response response = new Response("200","success" ,seats);
        return response;
    }

    @PostMapping(value ="/seats" )
    public Response get(@RequestBody SeatAllocationRequest seatAllocationRequest) {
        Seat seat =  seatAllocater.allocateSeat(seatAllocationRequest);
        Response response = new Response("201","success" ,seat);
        return response;
    }

}
