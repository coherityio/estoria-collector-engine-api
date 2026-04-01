package io.coherity.estoria.collector.engine.api;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CollectionRunSummary
{
    private final long totalCollectorCount;
    private final long successfulCollectorCount;
    private final long failedCollectorCount;
    private final long totalEntityCount;
}