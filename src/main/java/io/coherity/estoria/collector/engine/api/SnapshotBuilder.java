package io.coherity.estoria.collector.engine.api;

public interface SnapshotBuilder
{
    ProviderSnapshot mergeSnapshot(ProviderSnapshot providerSnapshot, CollectionResult collectionResult) throws SnapshotBuildException;
}
