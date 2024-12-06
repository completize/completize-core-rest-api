package com.completize.core.rest.api.infrastructure.validator;

public interface Validator<T> {

    void validate(T value);

}
