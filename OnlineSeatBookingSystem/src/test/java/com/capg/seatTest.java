package com.capg;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.capg.entity.Seat;
import com.capg.repository.SeatRepository;
import com.capg.service.SeatServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class seatTest {
    @Mock
    private SeatRepository seatRepository;

    @InjectMocks
    private SeatServiceImpl seatService;

    private Seat seat;

    @Before
    public void setUp() {
        seat = new Seat();
        seat.setSeatId(5);
        seat.setSeatFloor(2);
    }

    @Test
    public void addSeats_Success() {
        when(seatRepository.saveAndFlush(seat)).thenReturn(seat);

        Seat addedSeat = seatService.addSeats(seat);

        assertEquals(seat, addedSeat);
    }
}
