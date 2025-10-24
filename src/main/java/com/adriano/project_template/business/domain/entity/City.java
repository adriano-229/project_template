package com.adriano.project_template.business.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class City extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String zipCode;

    @ManyToOne(optional = false)
    private State state;
}
