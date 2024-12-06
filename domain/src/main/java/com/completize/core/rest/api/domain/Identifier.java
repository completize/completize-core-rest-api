package com.completize.core.rest.api.domain;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Getter(AccessLevel.PROTECTED)
public class Identifier<T> {

    protected T id;

}
