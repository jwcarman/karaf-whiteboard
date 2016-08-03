package com.carmanconsulting.karaf.whiteboard.bundle2;

import java.util.Dictionary;
import java.util.Hashtable;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.Constants;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Activator implements BundleActivator {
//----------------------------------------------------------------------------------------------------------------------
// Fields
//----------------------------------------------------------------------------------------------------------------------

    private static final Logger LOGGER = LoggerFactory.getLogger(Activator.class);
    private ServiceRegistration<ManagedService> registration;

//----------------------------------------------------------------------------------------------------------------------
// BundleActivator Implementation
//----------------------------------------------------------------------------------------------------------------------

    @Override
    public void start(BundleContext context) throws Exception {
        Hashtable<String,Object> props = new Hashtable<>();
        props.put(Constants.SERVICE_PID, "com.carmanconsulting.karaf.whiteboard");
        props.put("name", "bundle2");
        registration = context.registerService(ManagedService.class, new MyManagedService(), props);
    }

    @Override
    public void stop(BundleContext context) throws Exception {
        registration.unregister();
    }

//----------------------------------------------------------------------------------------------------------------------
// Inner Classes
//----------------------------------------------------------------------------------------------------------------------

    public static class MyManagedService implements ManagedService {
//----------------------------------------------------------------------------------------------------------------------
// ManagedService Implementation
//----------------------------------------------------------------------------------------------------------------------

        @Override
        public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
            LOGGER.info("My configuration was updated: {}", properties);
        }
    }
}
