package com.capg;

import static org.mockito.Mockito.when;

import java.util.stream.Stream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.entity.Seat;
import com.capg.repository.SeatRepository;
import com.capg.service.SeatService;


//@RunWith(SpringRunner.class)
@SpringBootTest
class OnlineSeatBookingSystemApplicationTests {
	
//	@Autowired
//	private SeatService seatService;
//	
//	@MockBean
//	private SeatRepository repository;
//	
//	@org.junit.Test
//	public void getSeatsTest() {
//		when(repository.findAll()).thenReturn(Stream.collectCollectors.toList());
//	    assertEquals(1,seatService.listAllSeat.size());
//	}
	
	@Test
	void contextLoads() {
	}

}
