package com.completize.core.rest.api.application.port.persistence.write.type;

import com.completize.core.rest.api.application.port.persistence.write.WriterPort;
import com.completize.core.rest.api.domain.Identifier;

public interface DeletePort<I> extends WriterPort {

    void delete(Identifier<I> identifier);

}
