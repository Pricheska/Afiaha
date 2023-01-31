package Netology.homeworks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {

    String film1 = "First";
    String film2 = "Second";
    String film3 = "Third";

    @Test
    public void test() {


        AfishaManager manager = new AfishaManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);

        String[] expected = {"First", "Second", "Third"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldShowMoviesInReverseOrder() {
        AfishaManager manager = new AfishaManager();
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);

        String[] expected = {"Third", "Second", "First"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
