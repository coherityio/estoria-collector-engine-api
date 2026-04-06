package io.coherity.estoria.collector.engine.api;

import java.util.Set;

import io.coherity.estoria.collector.spi.CollectorContext;

public interface CollectionPlanner
{
    CollectionPlan plan(String providerId, Set<String> targetEntityTypes, boolean skipAllDependencies, CollectorContext collectionContext) throws PlanningException;
    CollectionPlan plan(String providerId, Set<String> targetEntityTypes, Set<String> skipEntityTypes, CollectorContext collectionContext) throws PlanningException;
    CollectionPlan plan(String providerId, Set<String> skipEntityTypes, CollectorContext collectionContext) throws PlanningException;
    CollectionPlan plan(String providerId, CollectorContext collectionContext) throws PlanningException;
    
//    CollectionPlan plan(String providerId, CollectionContext collectionContext, Set<String> targetEntityTypes, boolean skipAllDependencies) throws PlanningException;
//    CollectionPlan plan(String providerId, CollectionContext collectionContext, Set<String> targetEntityTypes, Set<String> skipEntityTypes) throws PlanningException;
//    CollectionPlan plan(String providerId, CollectionContext collectionContext, Set<String> skipEntityTypes) throws PlanningException;
//    CollectionPlan plan(String providerId, CollectionContext collectionContext) throws PlanningException;
    
}
