package config;


import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/android.properties"})

public interface WebDriverConfig extends Config {
    @Key("browserstack.userName")
    String userName();

    @Key("browserstack.accessKey")
    String accessKey();

    @Key("app")
    String app();

    @Key("remoteUrl")
    String remoteURL();

    @Key("device")
    String device();

    @Key("os_version")
    String os_version();
}
