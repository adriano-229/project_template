package com.adriano.project_template.business.logic.service;

import com.adriano.project_template.business.domain.entity.Country;
import com.adriano.project_template.business.persistence.repository.CountryRepository;
import org.springframework.stereotype.Service;

@Service
public class CountryService extends BaseService<Country, Long> {

    public CountryService(CountryRepository repository) {
        super(repository);
    }
}
