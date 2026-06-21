package com.pgxplore.exception;

public class PortalAccessDeniedException extends RuntimeException {
    public PortalAccessDeniedException() {
        super("Portal access denied");
    }
}
