package io.coherity.estoria.collector.engine.api;

import java.util.Map;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CollectionSummary
{
	private int apiCallCount;
	private int cursorPageCount;
	private long bytesReceived;
	private Map<String, Object> customMetrics;
}