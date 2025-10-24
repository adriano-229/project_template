package com.adriano.project_template.business.persistence.repository;

import com.adriano.project_template.business.domain.entity.Person;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends BaseRepository<Person, Long> {
}
