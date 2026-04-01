package io.coherity.estoria.collector.engine.api;

import io.coherity.estoria.collector.spi.CollectionScope;

public interface ProviderSnapshot
{
    String getProviderId();
    CollectionScope getCollectionScope();
    ProviderSnapshotSummary getProviderSnapshotSummary();
    long getEntityCount();
    long getEntityCountByType(String entityType);
    CloudEntityPage getCloudEntityPage(String cursorToken, Integer pageSize);    
    CloudEntityPage getCloudEntityPageByType(String entityType, String cursorToken, Integer pageSize);    
}