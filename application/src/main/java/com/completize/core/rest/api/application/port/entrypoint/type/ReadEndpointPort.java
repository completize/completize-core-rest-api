package com.completize.core.rest.api.application.port.entrypoint.type;

import com.completize.core.rest.api.adapter.entrypoint.model.Dto;
import com.completize.core.rest.api.application.port.entrypoint.EndpointPort;

public interface ReadEndpointPort<D extends Dto, I> extends EndpointPort {

    D fetch(I identifier);

}
