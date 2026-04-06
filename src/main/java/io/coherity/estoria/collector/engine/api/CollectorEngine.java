package io.coherity.estoria.collector.engine.api;

import java.util.List;

import io.coherity.estoria.collector.spi.CloudProvider;
import io.coherity.estoria.collector.spi.Collector;

// CollectionEngine is the registration point for all CloudProviders and Collectors.
// It is also the factory for all CollectionPlanners, CollectionExectors and SnapshotBuilders.
// Any context needed for those to run should be setup by CollectorEngine.
public interface CollectorEngine
{
    CollectionPlanner getPlanner();
    CollectionExecutor getExecutor();
    SnapshotBuilder getSnapshotBuilder();
    
    List<CloudProvider> getLoadedCloudProviders();
    List<Collector> getLoadedCollectors(String providerId);
}
