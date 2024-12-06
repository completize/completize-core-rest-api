package com.completize.core.rest.api.domain.identifier;

import com.completize.core.rest.api.domain.Identifier;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;

@SuperBuilder
@Getter(AccessLevel.PACKAGE)
@EqualsAndHashCode(callSuper = true)
public class LongIdentifier extends Identifier<Long> implements Serializable {

    @Serial
    private static final long serialVersionUID = 5940661822095309916L;

}
