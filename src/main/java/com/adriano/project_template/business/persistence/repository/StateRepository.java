package com.adriano.project_template.business.persistence.repository;

import com.adriano.project_template.business.domain.entity.State;
import org.springframework.stereotype.Repository;

@Repository
public interface StateRepository extends BaseRepository<State, Long> {
}
