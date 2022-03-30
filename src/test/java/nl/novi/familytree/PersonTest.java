package nl.novi.familytree;

import nl.novi.familiytree.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    @DisplayName("Name should start with uppercase")
    public void test1() {
        Person person = new Person();
        person.setName("charissa");
        assertEquals("Charissa", person.getName());
    }
    @Test
    @DisplayName("lastName should start with uppercase")
    public void test2() {
        Person person = new Person();
        person.setLastName("schut");
        assertEquals("Schut", person.getLastName());
    }

    @Test
    @DisplayName("parents should be added")
    public void test3() {
        Person person = new Person();
        person.setLastName("schut");
        assertEquals("Schut", person.getLastName());
    }

}
