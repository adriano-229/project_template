package com.adriano.project_template.business.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Country extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    // LAZY load all states associated with the country
    // orphanRemoval to remove states when they are removed from the list
    @OneToMany(mappedBy = "country", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<State> states = new ArrayList<>();
}
