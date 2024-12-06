package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface DeleteAllUseCase<I> extends UseCase {

    void deleteAll(Identifier<I> identifier);

}
