package com.adriano.project_template.business.persistence.repository;

import com.adriano.project_template.business.domain.entity.City;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends BaseRepository<City, Long> {
}
