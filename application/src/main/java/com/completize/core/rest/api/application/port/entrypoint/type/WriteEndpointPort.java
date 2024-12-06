package com.completize.core.rest.api.application.port.entrypoint.type;

import com.completize.core.rest.api.adapter.entrypoint.model.Body;
import com.completize.core.rest.api.adapter.entrypoint.model.Dto;
import com.completize.core.rest.api.application.port.entrypoint.EndpointPort;

public interface WriteEndpointPort<D extends Dto, B extends Body, I> extends EndpointPort {

    D create(B value);
    D update(I identifier, B value);
    void delete(I identifier);

}
