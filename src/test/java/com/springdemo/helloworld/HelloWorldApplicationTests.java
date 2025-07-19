package com.springdemo.helloworld;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloWorldApplicationTests {

    @Test
    void contextLoads() {
    }
    @Test
    void testMainMethod() {
        HelloWorldApplication.main(new String[] {});
    }

}
