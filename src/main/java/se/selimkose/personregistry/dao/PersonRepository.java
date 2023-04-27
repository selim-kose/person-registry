package se.selimkose.personregistry.dao;

import org.springframework.data.repository.CrudRepository;
import se.selimkose.personregistry.entity.Person;

import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Integer> {
    Optional<Person> findByFirstName(String name);
    void deleteById(Integer id);
    Person getPersonByAge(Integer age);
}
