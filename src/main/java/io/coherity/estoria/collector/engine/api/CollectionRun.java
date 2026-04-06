package io.coherity.estoria.collector.engine.api;

import java.time.Instant;
import java.util.List;
import java.util.Optional;

import io.coherity.estoria.collector.spi.CollectorContext;
import io.coherity.estoria.collector.spi.ProviderContext;

public interface CollectionRun
{
    String getRunId();
    String getProviderId();
    ProviderContext getProviderContext();
    Instant getRunStartTime();
    Instant getRunEndTime();
    CollectionRunStatus getStatus();
	CollectionRunFailure getCollectionRunFailure();
	CollectionRunSummary getCollectionRunSummary();
	List<CollectionResult> getCollectionResults();
	Optional<CollectionResult> getCollectionResultByEntityType(String entityType);
}