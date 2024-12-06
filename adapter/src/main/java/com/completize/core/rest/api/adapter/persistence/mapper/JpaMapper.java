package com.completize.core.rest.api.adapter.persistence.mapper;

import com.completize.core.rest.api.adapter.persistence.model.JpaData;
import com.completize.core.rest.api.domain.Domain;

public interface JpaMapper<J extends JpaData, D extends Domain> {

    J toJpa(D value);
    J toJpa(D value, J jpa);
    D toDomain(J jpa);

}