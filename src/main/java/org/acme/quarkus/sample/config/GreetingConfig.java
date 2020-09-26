package org.acme.quarkus.sample.config;

import java.util.Optional;

import javax.validation.constraints.Size;

import io.quarkus.arc.config.ConfigProperties;

@ConfigProperties(prefix="greeting")
public class GreetingConfig {
    @Size(max = 10)
    private String name;//greeting.name
    private String suffix="!";
    private Optional<String> prefix;
    private CountryConfig country;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }

    public Optional<String> getPrefix() {
        return prefix;
    }   

    public void setPrefix(Optional<String> prefix) {
        this.prefix = prefix;
    }
    
    public static class  CountryConfig{
        String name;
        Integer id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }
    }

    public CountryConfig getCountry() {
        return country;
    }

    public void setCountry(CountryConfig country) {
        this.country = country;
    }
}