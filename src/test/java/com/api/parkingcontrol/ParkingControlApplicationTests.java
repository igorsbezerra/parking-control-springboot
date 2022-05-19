package com.api.parkingcontrol;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParkingControlApplicationTests {

	@Test
	void contextLoads() {
		var atual = "1";
		var expected = "1";
		Assertions.assertEquals(expected, atual);
	}
}
