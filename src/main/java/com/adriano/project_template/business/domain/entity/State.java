package com.adriano.project_template.business.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class State extends BaseEntity {

    @Column(nullable = false)
    private String name;

    // EAGER default load the one country associated with the state
    @ManyToOne(optional = false)
    private Country country;

    @OneToMany(mappedBy = "state", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<City> cities = new ArrayList<>();
}
