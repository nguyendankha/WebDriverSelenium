package org.example.config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"classpath:general.properties"})
public interface Configuration extends Config {
    @Key("baseUrl")
    String baseUrl();

    @Key("browser")
    String browser();

    @Key("timeout")
    int timeout();
}
