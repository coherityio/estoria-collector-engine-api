package io.coherity.estoria.collector.engine.api;

public class SnapshotBuildException extends Exception
{
	private static final long serialVersionUID = 1L;
	public SnapshotBuildException(String message)
    {
        super(message);
    }
    public SnapshotBuildException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
