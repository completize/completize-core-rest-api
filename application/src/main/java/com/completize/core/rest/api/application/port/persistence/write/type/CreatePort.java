package com.completize.core.rest.api.application.port.persistence.write.type;

import com.completize.core.rest.api.application.port.persistence.write.WriterPort;

public interface CreatePort<T> extends WriterPort {

    T create(T value);

}
