package washmore.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import washmore.tech.dao.PersonDao;
import washmore.tech.entity.Person;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonDao personDao;

    @GetMapping("/person")
    public List<Person> findByName(@RequestParam String name) {
        return personDao.findByName(name);
    }

    @GetMapping("/person/add")
    public Person findByName(@RequestParam String name, @RequestParam int age) {
        Person p = new Person();
        p.setAge(age);
        p.setName(name);
        return personDao.save(p);
    }
}
