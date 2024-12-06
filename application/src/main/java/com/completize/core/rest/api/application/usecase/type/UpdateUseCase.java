package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;

public interface UpdateUseCase<T> extends UseCase {

    T update(T value);

}
