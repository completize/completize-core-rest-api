package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface DeleteForUseCase<I> extends UseCase {

    void deleteFor(Identifier<I> identifier);

}
