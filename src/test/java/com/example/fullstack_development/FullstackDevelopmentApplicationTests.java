package com.example.fullstack_development;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.fullstack_development.controller.CarController;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class FullstackDevelopmentApplicationTests {

    @Autowired
    private CarController carController;

    @Test
    void contextLoads() {
        assertThat(carController).isNotNull();
    }



}
