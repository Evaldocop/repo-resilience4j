package com.evaldo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.evaldo.hello.BookService;

@SpringBootTest(classes = ReadingApplication.class)
class ReadingApplicationTests {
	private static final Logger LOG = LoggerFactory.getLogger(BookService.class);
	
	
    @Autowired
    private BookService resilience4jService;
	@Test
	void testeResilience4j(){
		LOG.info(resilience4jService.readingList().block());
	}

}
