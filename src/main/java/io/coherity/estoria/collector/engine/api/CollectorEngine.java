package io.coherity.estoria.collector.engine.api;

import java.util.Optional;
import java.util.Set;

import io.coherity.estoria.collector.spi.CloudProvider;

// CollectionEngine is the registration point for all CloudProviders and Collectors.
// It is also the factory for all CollectionPlanners, CollectionExectors and SnapshotBuilders.
// Any context needed for those to run should be setup by CollectorEngine.
public interface CollectorEngine
{
    CollectionPlanner getPlanner();
    CollectionExecutor getExecutor();
    SnapshotBuilder getSnapshotBuilder();
    
    Set<CloudProvider> getLoadedCloudProviders();
    Optional<CloudProvider> getLoadedCloudProvider(String providerId);
    Set<String> getRegisteredEntityTypes(String providerId);
}
