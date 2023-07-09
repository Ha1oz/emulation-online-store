package com.haloz.springonlinestore.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionsHandler {
    private final static Logger LOGGER = LoggerFactory.getLogger(ExceptionsHandler.class);
    @ExceptionHandler(NullPointerException.class)
    public void handleNullPointerException(NullPointerException e) {
        LOGGER.error(e.getMessage());
    }
}
