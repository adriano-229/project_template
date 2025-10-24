package com.adriano.project_template.business.domain.entity;

import com.adriano.project_template.business.domain.enums.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@PrimaryKeyJoinColumn
public class User extends Person {

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    // BCrypt encoding on service layer
    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role = Role.USER; // Default is User

}
