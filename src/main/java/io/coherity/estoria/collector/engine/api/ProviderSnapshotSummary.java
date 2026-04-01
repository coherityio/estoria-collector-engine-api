package io.coherity.estoria.collector.engine.api;

import lombok.Builder;
import lombok.Data;
import java.util.Map;
import java.util.Set;

@Data
@Builder
public class ProviderSnapshotSummary
{
    private int totalEntityCount;
    private int deduplicatedEntityCount;
    private int inferredEntityCount;
    private int orphanedEntityCount;
    private Set<String> discoveredEntityTypes;
    private Map<String, Integer> entityTypeDistribution;
    private Set<String> contributingCollectors;
    private Map<String, Integer> entityCountByCollector;
}
