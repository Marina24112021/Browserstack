package config;


import org.aeonbits.owner.Config;


@Config.Sources({
        "classpath:properties/${env}.properties",
        "classpath:properties/android.properties"})

public interface WebDriverConfig extends Config {
    @Key("browserstack.userName")
    String getUserName();

    @Key("browserstack.accessKey")
    String getAccessKey();

    @Key("app")
    String getApp();

    @Key("remoteUrl")
    String getRemoteURL();

    @Key("device")
    String getDevice();

    @Key("os_version")
    String getOs_version();
}
