package io.coherity.estoria.collector.engine.api;

import java.util.List;
import java.util.Set;

import io.coherity.estoria.collector.spi.CollectionScope;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CollectionPlan
{
	public static final int PAGE_SIZE_ALL = -1;
	
	private String providerId;
	private CollectionScope collectionScope;
	private List<String> entityTypeExecutionOrder;
	private Set<String> targetEntityTypes;
	private Set<String> skippedEntityTypes;
	private Integer pageSize;
	
	public CollectionPlan simpleCollectionPlan(String providerId, CollectionScope collectionScope, String targetEntityType)
	{
		return CollectionPlan
			.builder()
			.providerId(providerId)
			.collectionScope(collectionScope)
			.entityTypeExecutionOrder(List.of(targetEntityType))
			.targetEntityTypes(Set.of(targetEntityType))
			.pageSize(PAGE_SIZE_ALL)
			.build();
	}
	
    public CollectionPlan pageSizeAll()
    {
    	this.pageSize = PAGE_SIZE_ALL;
    	return this;
    }	
}
