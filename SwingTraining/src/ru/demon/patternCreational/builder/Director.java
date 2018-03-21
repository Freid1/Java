package ru.demon.patternCreational.builder;

public class Director {
    WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) {
        this.builder = builder;
    }

    WebSite buildWebSite(){
        builder.createWebSite();
        builder.BuildName();
        builder.BuildSurname();
        builder.BuildAddres();

        WebSite webSite=builder.getWebSite();

        return webSite;

    }

}
