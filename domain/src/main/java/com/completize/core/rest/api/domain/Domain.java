package com.completize.core.rest.api.domain;

import java.util.function.Function;

public interface Domain {

    static <T> T getIdValue(Identifier<T> identifier) {
        final Function<Identifier<T>, T> function = Identifier::getId;
        return function.apply(identifier);
    }

}
