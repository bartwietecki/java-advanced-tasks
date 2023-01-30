package homework.task2;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieTest {

    @Test
    void shouldReturnFilteredMovie() throws IllegalArgumentException {
        // Given
        List<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Title 1", "horror", 30, LocalDate.of(2020, 1, 1));
        Movie movie2 = new Movie("Title 2", "comedy", 10, LocalDate.of(2020, 1, 1));
        Movie movie3 = new Movie("Title 3", "horror", 15, LocalDate.of(2017, 1, 1));
        Movie movie4 = new Movie("Title 4", "horror", 25, LocalDate.of(2019, 1, 1));

        movies.add(movie1);
        movies.add(movie2);
        movies.add(movie3);
        movies.add(movie4);

        // When
        List<Movie> filteredMovies = Movie.filteringMoviesMethod(movies);

        List<Movie> expectedMovies = new ArrayList<>();
        expectedMovies.add(movie1);
        expectedMovies.add(movie4);

        // Then
        assertEquals(expectedMovies, filteredMovies);
    }
}