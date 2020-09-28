package org.acme.quarkus.sample;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import org.jboss.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
@ApplicationScoped
public class AppLifeCycleListener {
    public static Logger LOGGER=Logger.getLogger("Lifecycle");
    public void onStart(@Observes StartupEvent startupEvent){
        LOGGER.info("onStart executed");
        int a=3;
    }
    public void onStop(@Observes ShutdownEvent shutdownEvent){
        LOGGER.info("onStop executed");
    }
    
}