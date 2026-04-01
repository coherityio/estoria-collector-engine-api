package io.coherity.estoria.collector.engine.api;

import java.util.List;

import io.coherity.estoria.collector.spi.CloudEntity;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CloudEntityPage
{
	private final List<CloudEntity> entities;
	private final String nextCursorToken;
}