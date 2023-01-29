package homework.task2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void shouldReturnFilteredMovie() throws IllegalArgumentException {
        Movie movie1 = new Movie("Title 1", "horror", 30, LocalDate.of(2020, 1, 1));
        Movie movie2 = new Movie("Title 2", "comedy", 10, LocalDate.of(2020, 1, 1));
        Movie movie3 = new Movie("Title 3", "horror", 15, LocalDate.of(2017, 1, 1));
        Movie movie4 = new Movie("Title 4", "horror", 25, LocalDate.of(2019, 1, 1));

        List<Movie> movies = Arrays.asList(movie1, movie2, movie3, movie4);

        List<Movie> filteredMovies = movies.stream()
                .filter(m -> m.duration > 20)
                .filter(m -> m.releaseDate.getYear() > 2018)
                .filter(m -> m.type.equals("horror"))
                .collect(Collectors.toList());

        List<Movie> expectedResult = List.of(movie1, movie4);
        assertEquals(expectedResult, filteredMovies);
    }
}