package ru.demon.patternCreational.builder;

public abstract class WebSiteBuilder {
    public WebSite webSite;

    void createWebSite(){
     webSite=new WebSite();
    }

    abstract void  BuildName();
    abstract void  BuildSurname();
    abstract void  BuildAddres();

    WebSite getWebSite(){
        return webSite;
    }



}
