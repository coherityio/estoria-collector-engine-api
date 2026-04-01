package io.coherity.estoria.collector.engine.api;

import java.util.Set;

import io.coherity.estoria.collector.spi.CloudProvider;
import io.coherity.estoria.collector.spi.CollectionScope;

public interface CollectionPlanner
{
    CollectionPlan plan(CloudProvider provider, CollectionScope scope, Set<String> targetEntityTypes, boolean skipAllDependencies) throws PlanningException;
    CollectionPlan plan(CloudProvider provider, CollectionScope scope, Set<String> targetEntityTypes, Set<String> skipEntityTypes) throws PlanningException;
    CollectionPlan plan(CloudProvider provider, CollectionScope scope, Set<String> skipEntityTypes) throws PlanningException;
    CollectionPlan plan(CloudProvider provider, CollectionScope scope) throws PlanningException;
}
