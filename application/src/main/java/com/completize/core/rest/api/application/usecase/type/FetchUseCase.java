package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface FetchUseCase<T, I> extends UseCase {

    T fetch(Identifier<I> identifier);

}
