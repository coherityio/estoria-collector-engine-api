package io.coherity.estoria.collector.engine.api;

import java.util.List;

import io.coherity.estoria.collector.spi.CloudProvider;
import io.coherity.estoria.collector.spi.Collector;

public interface CollectorEngine
{
    CollectionPlanner getPlanner();
    CollectionExecutor getExecutor();
    SnapshotBuilder getSnapshotBuilder();
    
    List<CloudProvider> getLoadedCloudProviders();
    List<Collector> getLoadedCollectors(String providerId);
}
