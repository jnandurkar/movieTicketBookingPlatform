package com.mtbp.web.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mtbp.business.domain.MovieScreening;
import com.mtbp.web.application.ScreeningController;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ScreeningControllerIntegrationTest {

    @Autowired
    ScreeningController screeningController;

    @Test
    public void getScreenings() {
    }

    @Test
    public void testBookSeats() {
        MovieScreening aMovieScreening = new MovieScreening();
        aMovieScreening.setMovieName("Race 3");
        aMovieScreening.setScreeningDate("2018-05-25");
        aMovieScreening.setScreeningTime("18:00:00");
        aMovieScreening.setTheatreCity("PUNE");
        aMovieScreening.setTheatreName("INOX");
        aMovieScreening.setNumSeats(5);

        String result = screeningController.bookSeats(aMovieScreening);

        assertEquals(result, "result");
    }

    @Test
    public void testBookSeatsExceedCapacity() {
        /* Theatre capacity set to 100 in data.sql */
        MovieScreening aMovieScreening = new MovieScreening();
        aMovieScreening.setMovieName("Race 3");
        aMovieScreening.setScreeningDate("2018-05-25");
        aMovieScreening.setScreeningTime("18:00:00");
        aMovieScreening.setTheatreCity("PUNE");
        aMovieScreening.setTheatreName("INOX");
        aMovieScreening.setNumSeats(96);

        String result = screeningController.bookSeats(aMovieScreening);

        assertEquals(result, "error");
    }
}