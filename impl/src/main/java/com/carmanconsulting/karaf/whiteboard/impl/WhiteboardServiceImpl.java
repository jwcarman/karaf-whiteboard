package com.carmanconsulting.karaf.whiteboard.impl;

import com.carmanconsulting.karaf.whiteboard.api.WhiteboardService;
import com.carmanconsulting.karaf.whiteboard.spi.WhiteboardPlugin;
import com.savoirtech.eos.pattern.whiteboard.KeyedWhiteboard;
import org.osgi.framework.BundleContext;

public class WhiteboardServiceImpl extends KeyedWhiteboard<String,WhiteboardPlugin> implements WhiteboardService {
//----------------------------------------------------------------------------------------------------------------------
// Constructors
//----------------------------------------------------------------------------------------------------------------------

    public WhiteboardServiceImpl(BundleContext bundleContext) {
        super(bundleContext, WhiteboardPlugin.class, (svc,props) -> props.getProperty("name"));
    }
}
