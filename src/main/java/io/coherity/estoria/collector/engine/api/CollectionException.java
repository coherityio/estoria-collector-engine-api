package io.coherity.estoria.collector.engine.api;

public class CollectionException extends Exception
{
	private static final long serialVersionUID = 1L;

	public CollectionException(String message)
    {
        super(message);
    }

    public CollectionException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
