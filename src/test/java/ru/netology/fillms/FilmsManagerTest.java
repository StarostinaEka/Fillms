
package ru.netology.fillms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {

          @Test

        public void AddThreeFilms() {
            FilmsManager manager = new FilmsManager();

            manager.add("Film 1");
            manager.add("Film 2");
            manager.add("Film 3");

            String[] expected = {"Film 1", "Film 2", "Film 3"}
            String[] actual = manager.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test

        public void ShouldShowLastAtBegin() {
            FilmsManager manager = new FilmsManager();

            manager.add("Film 1");
            manager.add("Film 2");
            manager.add("Film 3");

            String[] expected = {"Film 3", "Film 2", "Film 1"}
            String[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }


        @Test
        void addElevenFilmsFindAll() {
            FilmsManager manager = new FilmsManager();
            manager.add("Film 1");
            manager.add("Film 2");
            manager.add("Film 3");
            manager.add("Film 4");
            manager.add("Film 5");
            manager.add("Film 6");
            manager.add("Film 7");
            manager.add("Film 8");
            manager.add("Film 9");
            manager.add("Film 10");
            manager.add("Film 11");

            String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5", "Film 6", "Film 7", "Film 8", "Film 9", "Film 10"}
            String[] actual = manager.findAll();

            Assertions.assertArrayEquals(expected, actual);
        }

        @Test

        public void ShouldShowLastTenAtBegin() {
            FilmsManager manager = new FilmsManager();

            manager.add("Film 1");
            manager.add("Film 2");
            manager.add("Film 3");
            manager.add("Film 4");
            manager.add("Film 5");
            manager.add("Film 6");
            manager.add("Film 7");
            manager.add("Film 8");
            manager.add("Film 9");
            manager.add("Film 10");
            manager.add("Film 11");

            String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"}
            String[] actual = manager.findLast();

            Assertions.assertArrayEquals(expected, actual);
        }
    }
