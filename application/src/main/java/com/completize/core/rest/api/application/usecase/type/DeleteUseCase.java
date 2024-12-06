package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.domain.Identifier;

public interface DeleteUseCase<I> extends UseCase {

    void delete(Identifier<I> identifier);

}
