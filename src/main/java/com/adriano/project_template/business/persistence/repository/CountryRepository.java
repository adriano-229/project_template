package com.adriano.project_template.business.persistence.repository;

import com.adriano.project_template.business.domain.entity.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends BaseRepository<Country, Long> {
}
