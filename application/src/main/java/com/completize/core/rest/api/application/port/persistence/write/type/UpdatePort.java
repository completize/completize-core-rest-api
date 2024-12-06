package com.completize.core.rest.api.application.port.persistence.write.type;

import com.completize.core.rest.api.application.port.persistence.write.WriterPort;

import java.util.Optional;

public interface UpdatePort<T> extends WriterPort {

    Optional<T> update(T value);

}
