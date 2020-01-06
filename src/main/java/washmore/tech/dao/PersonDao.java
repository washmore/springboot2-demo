package washmore.tech.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import washmore.tech.entity.Person;

import java.util.List;

@Repository
public interface PersonDao extends JpaRepository<Person, Long> {
    @Query(value = "SELECT * FROM person p WHERE p.name=?", nativeQuery = true)
    List<Person> findByName(String name);
}
