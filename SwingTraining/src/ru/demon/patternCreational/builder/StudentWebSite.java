package ru.demon.patternCreational.builder;

public class StudentWebSite extends WebSiteBuilder {
    @Override
    void BuildName() {
        webSite.setName("Vasy");
    }

    @Override
    void BuildSurname() {
        webSite.setSurname("Pupkin");

    }

    @Override
    void BuildAddres() {
        webSite.setAddres("Shali");

    }
}
