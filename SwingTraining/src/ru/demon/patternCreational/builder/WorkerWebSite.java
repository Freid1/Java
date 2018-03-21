package ru.demon.patternCreational.builder;

public class WorkerWebSite extends WebSiteBuilder {

    @Override
    void BuildName() {
        webSite.setName("Fedor");
    }

    @Override
    void BuildSurname() {
        webSite.setSurname("Shmit");
    }

    @Override
    void BuildAddres() {
        webSite.setAddres("Mozdok");
    }
}
