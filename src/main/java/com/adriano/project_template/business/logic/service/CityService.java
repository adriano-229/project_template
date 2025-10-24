package com.adriano.project_template.business.logic.service;

import com.adriano.project_template.business.domain.entity.City;
import com.adriano.project_template.business.persistence.repository.CityRepository;
import org.springframework.stereotype.Service;

@Service
public class CityService extends BaseService<City, Long> {

    public CityService(CityRepository repository) {
        super(repository);
    }
}
