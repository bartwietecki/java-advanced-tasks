package homework.task9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class MovieClass {

    private String title;
    private String movieDirector;
    private int yearOfRelease;

    public MovieClass(String title, String movieDirector, int yearOfRelease) {
        this.title = title;
        this.movieDirector = movieDirector;
        this.yearOfRelease = yearOfRelease;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public void setMovieDirector(String movieDirector) {
        this.movieDirector = movieDirector;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }


    public static void main(String[] args) {
        List<MovieClass> movieClassList = new ArrayList<>();
        MovieClass movieClass1 = new MovieClass("Top Gun", "Tony Scott", 1986);
        MovieClass movieClass2 = new MovieClass("Top Gun", "Tony Scott", 1986);
        addObjectsToList(movieClassList, movieClass1);
        addObjectsToList(movieClassList, movieClass2);


        System.out.println(movieClassList);

        HashSet<MovieClass> movieClassHashSet = new HashSet<>();
        addObjectsToHashSet(movieClassHashSet, movieClass1);
        addObjectsToHashSet(movieClassHashSet, movieClass2);

        System.out.println(movieClassHashSet);
    }


    public static void addObjectsToList(List<MovieClass> movieClassList, MovieClass movieClass) {
        movieClassList.add(movieClass);
    }

    public static void addObjectsToHashSet(HashSet<MovieClass> movieClassHashSet, MovieClass movieClass){
        movieClassHashSet.add(movieClass);
    }

    // Aby dodać dwa identyczne obiekty do listy, należy zaimplementować metodę equals
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieClass movie = (MovieClass) o;
        return yearOfRelease == movie.yearOfRelease &&
                title.equals(movie.title) &&
                movieDirector.equals(movie.movieDirector);
    }

    // Aby dodać dwa takie same obiekty do HashSetu, należy również zaimplementować metodę hashCode
    public int hashCode() {
        return Objects.hash(title, yearOfRelease, movieDirector);
    }

    @Override
    public String toString() {
        return "MovieClass{" +
                "title='" + title + '\'' +
                ", movieDirector='" + movieDirector + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                '}';
    }

}
