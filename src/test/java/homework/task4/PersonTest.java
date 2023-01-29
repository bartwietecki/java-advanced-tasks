package homework.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testPerson(){
        Person person = new Person() {
            @Override
            public void showDetails() {

            }
        };
        assertEquals("", person.getName());
        assertEquals("", person.getAddress());
    }

    @Test
    public void testGetName(){
        Person person = new Person("Jan Kowalski", "Kwiatowa 13") {
            @Override
            public void showDetails() {

            }
        };
        assertEquals("Jan Kowalski", person.getName());
    }

    @Test
    public void testSetName(){
        Person person = new Person("Jan Kowalski", "Kwiatowa 13") {
            @Override
            public void showDetails() {

            }
        };
        person.setName("Jan Kowalski");
        assertEquals("Jan Kowalski", person.getName());
    }


    @Test
    public void testGetAddress(){
        Person person = new Person("Jan Kowalski", "Kwiatowa 13") {
            @Override
            public void showDetails() {

            }
        };
        assertEquals("Kwiatowa 13", person.getAddress());
    }

    @Test
    public void testSetAddress(){
        Person person = new Person("Jan Kowalski", "Kwiatowa 13") {
            @Override
            public void showDetails() {

            }
        };
        person.setAddress("Kwiatowa 13");
        assertEquals("Kwiatowa 13", person.getAddress());
    }

}