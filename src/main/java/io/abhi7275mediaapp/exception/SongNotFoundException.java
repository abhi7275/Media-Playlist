package io.abhi7275mediaapp.exception;

import java.math.BigInteger;

@SuppressWarnings("serial")
public class SongNotFoundException extends RuntimeException {

	public SongNotFoundException(final BigInteger id) {
		super(String.format("song with id '%s' not found", id));
	}
}