package com.completize.core.rest.api.adapter.entrypoint.mapper;

import com.completize.core.rest.api.adapter.entrypoint.model.Body;
import com.completize.core.rest.api.adapter.entrypoint.model.Dto;
import com.completize.core.rest.api.domain.Domain;

public interface DtoMapper<T extends Domain, D extends Dto, B extends Body, I> {

    D toDto(T value);
    T toDomainFrom(B value);
    T toDomainFrom(I id, B value);

}
