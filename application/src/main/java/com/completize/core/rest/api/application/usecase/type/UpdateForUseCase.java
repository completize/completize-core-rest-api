package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface UpdateForUseCase<T, I> extends UseCase {

    T updateFor(Identifier<I> identifier, T value);

}
