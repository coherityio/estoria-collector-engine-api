package io.coherity.estoria.collector.engine.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CollectionRunFailure
{
    private final String message;
    private final String exceptionClassName;
}