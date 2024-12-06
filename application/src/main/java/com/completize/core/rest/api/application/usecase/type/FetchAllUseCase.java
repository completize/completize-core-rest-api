package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

import java.util.Collection;

public interface FetchAllUseCase<T, I> extends UseCase {

    Collection<T> fetchAll(Identifier<I> identifier);

}
