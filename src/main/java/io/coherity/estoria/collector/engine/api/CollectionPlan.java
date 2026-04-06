package io.coherity.estoria.collector.engine.api;

import java.util.List;
import java.util.Set;

import io.coherity.estoria.collector.spi.CollectorContext;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollectionPlan
{
	public static final int PAGE_SIZE_ALL = -1;
	
	private String providerId;
	private List<String> entityTypeExecutionOrder;
	private Set<String> targetEntityTypes;
	private Set<String> skippedEntityTypes;
	private Integer pageSize;
	private CollectorContext collectorContext;
	
	public CollectionPlan simpleCollectionPlan(String providerId, String targetEntityType)
	{
		return CollectionPlan
			.builder()
			.providerId(providerId)
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
