package io.coherity.estoria.collector.engine.api;

public class PlanningException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	public PlanningException(String message)
    {
        super(message);
    }
    public PlanningException(String message, Throwable cause)
    {
        super(message, cause);
    }
}
