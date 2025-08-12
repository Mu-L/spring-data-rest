package org.springframework.data.rest.core.event;

import java.io.Serial;

/**
 * An event to encapsulate an exception occurring anywhere within the REST exporter.
 *
 * @author Jon Brisbin
 */
public class ExceptionEvent extends RepositoryEvent {

	private static final @Serial long serialVersionUID = 6614805546974091704L;

	public ExceptionEvent(Throwable t) {
		super(t);
	}

	/**
	 * Get the source of this exception event.
	 *
	 * @return The {@link Throwable} that is the source of this exception event.
	 */
	public Throwable getException() {
		return (Throwable) getSource();
	}
}
