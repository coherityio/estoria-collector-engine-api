package io.coherity.estoria.collector.engine.api;

import java.time.Instant;

import io.coherity.estoria.collector.spi.CollectorContext;

public interface CollectionResult
{
    String getResultId();
    String getCollectorId();
    CollectorContext getCollectorContext();
    String getEntityType();
    long getEntityCount();
    Instant getCollectionStartTime();
    Instant getCollectionEndTime();
    boolean isSuccess();
    CollectionFailure getCollectionFailure();
    CollectionSummary getCollectionSummary();
    CloudEntityPage getCloudEntityPage(String cursorToken, Integer pageSize);
}