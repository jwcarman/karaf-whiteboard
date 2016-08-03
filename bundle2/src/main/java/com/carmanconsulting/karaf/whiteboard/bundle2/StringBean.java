package com.carmanconsulting.karaf.whiteboard.bundle2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StringBean {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringBean.class);

    private final String value;

    public StringBean(String value) {
        this.value = value;
    }

    public void init() {
        LOGGER.info("My value has been configured to \"{}\".", value);
    }
}
