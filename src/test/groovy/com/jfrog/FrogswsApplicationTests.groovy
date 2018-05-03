package com.jfrog

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.web.WebAppConfiguration

@RunWith(SpringJUnit4ClassRunner)
@SpringBootTest(classes = FrogswsApplication)
@WebAppConfiguration
class FrogswsApplicationTests {

	@Test
	void contextLoads() {
	}

}
