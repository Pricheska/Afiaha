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

    @Test
    public void ShouldFindAllIfAddedFewerThanLimit() {
        AfishaManager manager = new AfishaManager(3);
        manager.addFilms(film1);
        manager.addFilms(film2);
        String[] expected = {"First", "Second",};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfAddedMoreThanLimit() {
        AfishaManager manager = new AfishaManager(2);
        manager.addFilms(film1);
        manager.addFilms(film2);
        manager.addFilms(film3);
        String[] expected = {"Third", "Second"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ShouldFindAllIfAddedLimitAmount() {
        AfishaManager manager = new AfishaManager(2);
        manager.addFilms(film1);
        manager.addFilms(film2);
        String[] expected = {"First", "Second"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
}
