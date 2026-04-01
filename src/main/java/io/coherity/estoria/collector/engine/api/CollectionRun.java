package io.coherity.estoria.collector.engine.api;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import io.coherity.estoria.collector.spi.CollectionScope;

public interface CollectionRun
{
    String getRunId();
    String getProviderId();
    CollectionScope getCollectionScope();
    Instant getRunStartTime();
    Instant getRunEndTime();
    CollectionRunStatus getStatus();
	CollectionRunFailure getCollectionRunFailure();
	CollectionRunSummary getCollectionRunSummary();
	List<CollectionResult> getCollectionResults();
	Optional<CollectionResult> getCollectionResult(String collectorId);
}