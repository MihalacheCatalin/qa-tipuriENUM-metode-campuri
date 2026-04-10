package com.catalinmihalache.homework;

public class BrowserConfig {
    private BrowserType browser;
    private String version;
    private boolean isHeadless;

    // 1. Constructor complet
    public BrowserConfig(BrowserType browser, String version, boolean isHeadless) {
        this.browser = browser;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // 2. Constructor cu 2 parametri (apelează constructorul 1)
    public BrowserConfig(BrowserType browser, String version) {
        this(browser, version, false);
    }

    // 3. Constructor cu 1 parametru (apelează constructorul 2)
    public BrowserConfig(BrowserType browser) {
        this(browser, "latest");
    }

    // Metoda Statică "Factory"
    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    // Metoda de Afișare
    public void afiseazaConfig() {
        System.out.println("Browser: " + browser +
                ", Version: " + version +
                ", Headless: " + isHeadless);
    }
}