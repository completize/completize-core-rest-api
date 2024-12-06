package com.completize.core.rest.api.application.port.entrypoint.type;

import com.completize.core.rest.api.adapter.entrypoint.model.Dto;
import com.completize.core.rest.api.application.port.entrypoint.EndpointPort;

import java.util.Collection;

public interface ReadAllEndpointPort<D extends Dto, I> extends EndpointPort {

    Collection<D> fetchAll(I identifier);

}
