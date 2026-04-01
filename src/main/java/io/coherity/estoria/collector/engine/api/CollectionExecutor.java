package io.coherity.estoria.collector.engine.api;

import io.coherity.estoria.collector.spi.ProviderSession;

public interface CollectionExecutor
{
    CollectionRun collect(CollectionPlan collectionPlan, ProviderSession session) throws ExecutionException;
}
