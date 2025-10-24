package com.adriano.project_template.business.logic.service;

import com.adriano.project_template.business.domain.entity.Person;
import com.adriano.project_template.business.persistence.repository.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends BaseService<Person, Long> {

    public PersonService(PersonRepository repository) {
        super(repository);
    }
}
