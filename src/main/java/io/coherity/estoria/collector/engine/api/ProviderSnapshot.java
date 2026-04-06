package io.coherity.estoria.collector.engine.api;

import io.coherity.estoria.collector.spi.CollectorContext;

public interface ProviderSnapshot
{
    String getProviderId();
    CollectorContext getCollectionScope();
    ProviderSnapshotSummary getProviderSnapshotSummary();
    long getEntityCount();
    long getEntityCountByType(String entityType);
    CloudEntityPage getCloudEntityPage(String cursorToken, Integer pageSize);    
    CloudEntityPage getCloudEntityPageByType(String entityType, String cursorToken, Integer pageSize);    
}