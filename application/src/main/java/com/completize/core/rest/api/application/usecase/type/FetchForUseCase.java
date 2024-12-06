package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface FetchForUseCase<T, I> extends UseCase {

    T fetchFor(Identifier<I> identifier);

}
