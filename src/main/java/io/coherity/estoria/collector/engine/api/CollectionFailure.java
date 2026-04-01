package io.coherity.estoria.collector.engine.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CollectionFailure
{
    private final String exceptionClassName;
    private final String message;
}