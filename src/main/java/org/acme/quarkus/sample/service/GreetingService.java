package org.acme.quarkus.sample.service;

import java.util.UUID;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.acme.quarkus.sample.config.Base64Value;
import org.acme.quarkus.sample.config.GreetingConfig;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ApplicationScoped
public class GreetingService {

    @Inject
    private GreetingConfig greetingconfig; 

    @ConfigProperty(name="greeting.base64name")
    Base64Value name;

    //@ConfigProperty(name="greeting.name")
    //String name;
    //@ConfigProperty(name="greeting.suffix",defaultValue = "!")
    //String suffix;

    //@ConfigProperty(name="greeting.prefix")
    //Optional<String> prefix;

    

    public String sayHello(){
        //final String name = ConfigProvider.getConfig().getValue("greeting.name",String.class);
        return greetingconfig.getPrefix().orElse("_")+name+greetingconfig.getSuffix()+" your country is "+greetingconfig.getCountry().getName();
    }

    public String sayHello(String name){
        return String.format("Hello %s,your id is %s", name, UUID.randomUUID().toString());
    }
    
}