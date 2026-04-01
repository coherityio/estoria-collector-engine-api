package io.coherity.estoria.collector.engine.api;

import java.time.Instant;

public interface CollectionResult
{
    String getEntityType();
    long getEntityCount();
    Instant getCollectionStartTime();
    Instant getCollectionEndTime();
    boolean isSuccess();
    CollectionFailure getCollectionFailure();
    CollectionSummary getCollectionSummary();
    CloudEntityPage getCloudEntityPage(String cursorToken, Integer pageSize);
}