package com.adriano.project_template.business.persistence.repository;

import com.adriano.project_template.business.domain.entity.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {
    Optional<User> findByEmail(String email);
}
