package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;

public interface CreateUseCase<T> extends UseCase {

    T create(T value);

}
