package homework.task9;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieClassTest {

    @Test
    public void testGetTitle() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        assertEquals("Top Gun", movieClassTitle.getTitle());
    }

    @Test
    public void testSetTitle() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        movieClassTitle.setTitle("Top Gun");
        assertEquals("Top Gun", movieClassTitle.getTitle());
    }

    @Test
    public void testGetMovieDirector() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        assertEquals("Tony Scott", movieClassTitle.getMovieDirector());
    }

    @Test
    public void testSetMovieDirector() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        movieClassTitle.setMovieDirector("Tony Scott");
        assertEquals("Tony Scott", movieClassTitle.getMovieDirector());
    }

    @Test
    public void testGetYearOfRelease() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        assertEquals(1986, movieClassTitle.getYearOfRelease());
    }

    @Test
    public void testSetYearOfRelease() {
        MovieClass movieClassTitle = new MovieClass("Top Gun", "Tony Scott", 1986);
        movieClassTitle.setYearOfRelease(1986);
        assertEquals(1986, movieClassTitle.getYearOfRelease());
    }

    @Test
    public void testToString(){
        MovieClass movieClass = new MovieClass("Top Gun", "Tony Scott", 1986);

        String expected = "MovieClass{title='Top Gun', movieDirector='Tony Scott', yearOfRelease=1986}";

        String result = movieClass.toString();

        assertEquals(expected, result);
    }

    @Test
    public void shouldAddObjectToList() {
        List<MovieClass> movieClassList = new ArrayList<>();

        MovieClass movieClass1 = new MovieClass("Top Gun", "Tony Scott", 1986);
        MovieClass movieClass2 = new MovieClass("Top Gun", "Tony Scott", 1986);

        MovieClass.addObjectsToList(movieClassList, movieClass1);
        MovieClass.addObjectsToList(movieClassList, movieClass2);

        assertEquals(2, movieClassList.size());
    }


    @Test
    public void shouldAddObjectToHashSet() {
        HashSet<MovieClass> movieClassHashSet = new HashSet<>();

        MovieClass movieClass1 = new MovieClass("Top Gun", "Tony Scott", 1986);
        MovieClass movieClass2 = new MovieClass("Top Gun", "Tony Scott", 1986);

        MovieClass.addObjectsToHashSet(movieClassHashSet, movieClass1);
        MovieClass.addObjectsToHashSet(movieClassHashSet, movieClass2);

        assertEquals(1, movieClassHashSet.size());
    }

    @Test
    public void equalsTest() {
        MovieClass movieClass1 = new MovieClass("Top Gun", "Tony Scott", 1986);
        MovieClass movieClass2 = new MovieClass("Top Gun", "Tony Scott", 1986);

//        assertTrue(movieClass1.equals(movieClass2));

        assertEquals(movieClass1, movieClass2);

        MovieClass movieClass3 = new MovieClass("Top Gun", "Tony Scott", 1986);
//        assertFalse(movieClass1.equals(movieClass3));

        assertEquals(movieClass1, movieClass3);

        // assertNotEquals nie przechodzi .. /?
    }


    @Test
    public void hashCodeTest() {
        MovieClass movieClass1 = new MovieClass("Top Gun", "Tony Scott", 1986);
        MovieClass movieClass2 = new MovieClass("Top Gun", "Tony Scott", 1986);

        int hashCode1 = movieClass1.hashCode();
        int hashCode2 = movieClass2.hashCode();

        assertEquals(hashCode1, hashCode2);
    }
}
