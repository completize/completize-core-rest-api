package com.completize.core.rest.api.application.port.persistence.read.type;

import com.completize.core.rest.api.application.port.persistence.read.ReaderPort;
import com.completize.core.rest.api.domain.Identifier;

public interface ContainsAllPort<I> extends ReaderPort {

    boolean containsAll(Identifier<I> identifier);

}
