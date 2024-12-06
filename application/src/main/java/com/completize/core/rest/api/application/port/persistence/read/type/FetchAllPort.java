package com.completize.core.rest.api.application.port.persistence.read.type;

import com.completize.core.rest.api.application.port.persistence.read.ReaderPort;
import com.completize.core.rest.api.domain.Identifier;

import java.util.Collection;

public interface FetchAllPort<T, I> extends ReaderPort {

    Collection<T> fetchAll(Identifier<I> identifier);

}
