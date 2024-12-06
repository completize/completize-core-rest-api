package com.completize.core.rest.api.domain.identifier;

import com.completize.core.rest.api.domain.Identifier;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@SuperBuilder
@Getter(AccessLevel.PACKAGE)
@EqualsAndHashCode(callSuper = true)
public class UuidIdentifier extends Identifier<UUID> implements Serializable {

    @Serial
    private static final long serialVersionUID = 2578183211009033044L;

}
