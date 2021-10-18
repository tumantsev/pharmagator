package com.eleks.academy.pharmagator;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;


@SpringBootTest
@ActiveProfiles("test")
class PharmagatorApplicationTests {

	@Test
	void contextLoads() {
		assertEquals(12 ,13);
	}

}
