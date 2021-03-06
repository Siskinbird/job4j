package search;

import org.junit.Test;
import ru.job4j.search.Person;
import ru.job4j.search.PhoneDictionary;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
       var phones = new PhoneDictionary();
        phones.add(new Person("Sonya", "Blaid", "420420", "USA"));
        phones.add(new Person("Ded", "Moroz", "4243420", "Skazka"));
        phones.add(new Person("Gennadiy", "Krocodil", "53552", "Multik"));
        phones.add(new Person("Iosif", "Stalin", "420420", "Sovyetsky Soyouz"));
        ArrayList<Person> persons = phones.find("Iosif");
        assertThat(persons.get(0).getSurname(), is("Stalin"));
    }
    @Test
    public void whenFindByPrefix() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Iosif", "Stalin", "420420", "Sovyetsky Soyouz"));
        ArrayList<Person> persons = phones.find("uz");
        assertThat(persons.get(0).getAddress(), is("Sovyetsky Soyouz"));
    }
    @Test
    public void whenFindTwoPersons() {
        var phones = new PhoneDictionary();
        phones.add(new Person("Iosif", "Stalin", "420420", "Sovyetsky Soyouz"));
        phones.add(new Person("Ivan", "Grozniy", "666666", "High on sky"));
        ArrayList<Person> persons = phones.find("sky");
        assertThat(persons.get(0).getName(), is("Iosif"));
        assertThat(persons.get(1).getName(), is("Ivan"));
        assertThat(persons.get(0).getPhone(), is("420420"));
        assertThat(persons.get(1).getPhone(), is("666666"));
    }
    @Test
    public void whenFindByNamePredicateUse() {
        var phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname(), is("Arsentev"));
    }
}
