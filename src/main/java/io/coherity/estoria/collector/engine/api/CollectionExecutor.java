package io.coherity.estoria.collector.engine.api;

import io.coherity.estoria.collector.spi.ProviderContext;

public interface CollectionExecutor
{
    CollectionRun collect(CollectionPlan collectionPlan, ProviderContext providerContext) throws ExecutionException;
    CollectionRun getCollectedRun(String runId) throws ExecutionException;
    
}
