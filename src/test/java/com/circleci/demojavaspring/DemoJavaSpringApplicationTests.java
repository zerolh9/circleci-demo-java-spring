package com.circleci.demojavaspring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration
@TestPropertySource("/test.properties")
public class DemoJavaSpringApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void contextLoads1() {
		assertTrue(false);
	}

}
