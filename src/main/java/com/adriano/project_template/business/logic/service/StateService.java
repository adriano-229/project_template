package com.adriano.project_template.business.logic.service;

import com.adriano.project_template.business.domain.entity.State;
import com.adriano.project_template.business.persistence.repository.StateRepository;
import org.springframework.stereotype.Service;

@Service
public class StateService extends BaseService<State, Long> {

    public StateService(StateRepository repository) {
        super(repository);
    }
}
