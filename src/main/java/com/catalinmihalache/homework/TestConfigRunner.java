package com.catalinmihalache.homework;

public class TestConfigRunner {
    public static void main(String[] args) {
        System.out.println("--- Testare Constructori ---");

        // Instanță folosind constructorul cu 1 parametru
        BrowserConfig config1 = new BrowserConfig(BrowserType.FIREFOX);
        config1.afiseazaConfig();

        // Instanță folosind constructorul cu 2 parametri
        BrowserConfig config2 = new BrowserConfig(BrowserType.EDGE, "112.0");
        config2.afiseazaConfig();

        // Instanță folosind constructorul cu 3 parametri
        BrowserConfig config3 = new BrowserConfig(BrowserType.CHROME, "115.0", true);
        config3.afiseazaConfig();

        System.out.println("\n--- Testare Metodă Factory ---");

        // Instanță folosind metoda statică factory
        BrowserConfig defaultChrome = BrowserConfig.createDefaultChromeConfig();
        defaultChrome.afiseazaConfig();
    }
}