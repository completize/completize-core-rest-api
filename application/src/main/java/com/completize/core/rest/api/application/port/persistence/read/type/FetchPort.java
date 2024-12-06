package com.completize.core.rest.api.application.port.persistence.read.type;

import com.completize.core.rest.api.application.port.persistence.read.ReaderPort;
import com.completize.core.rest.api.domain.Identifier;

import java.util.Optional;

public interface FetchPort<T, I> extends ReaderPort {

    Optional<T> fetch(Identifier<I> identifier);

}
