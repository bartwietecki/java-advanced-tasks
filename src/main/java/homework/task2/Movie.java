package homework.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Movie {
    String title;
    String type;
    long duration;
    LocalDate releaseDate;


    public static void main(String[] args) {
        Movie movie1 = new Movie("Title 1", "horror", 30, LocalDate.of(2020, 1, 1));
        Movie movie2 = new Movie("Title 2", "comedy", 10, LocalDate.of(2020, 1, 1));
        Movie movie3 = new Movie("Title 3", "horror", 15, LocalDate.of(2017, 1, 1));
        Movie movie4 = new Movie("Title 4", "horror", 25, LocalDate.of(2019, 1, 1));

        List<Movie> movies = Arrays.asList(movie1, movie2, movie3, movie4);

        List<Movie> filteredMovies = movies.stream()
                .filter(movie -> movie.duration > 20)
                .filter(movie -> movie.releaseDate.getYear() > 2018)
                .filter(movie -> movie.type.equals("horror"))
                .collect(Collectors.toList());

        System.out.println(" All movies: " + movies);

        System.out.println("Filtered movies: " + filteredMovies);
    }

}
