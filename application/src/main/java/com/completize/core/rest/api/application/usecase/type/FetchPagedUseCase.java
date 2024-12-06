package com.completize.core.rest.api.application.usecase.type;

import com.completize.core.rest.api.application.usecase.UseCase;
import com.completize.core.rest.api.infrastructure.provisional.ProvisionalPage;

import java.util.Collection;

public interface FetchPagedUseCase<T> extends UseCase {

    Collection<T> fetchAll(ProvisionalPage page);

}
