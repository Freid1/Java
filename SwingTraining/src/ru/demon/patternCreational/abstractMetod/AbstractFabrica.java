package ru.demon.patternCreational.abstractMetod;

public class AbstractFabrica {
    public AbstractFabrica(String typeProject) {
        if(typeProject.equalsIgnoreCase("cpp")){
            AbstractFactoryDeveloper abstractFactoryDeveloper=new CppTeam();
            abstractFactoryDeveloper.createDeveloper().creatCode();
            abstractFactoryDeveloper.createTestDeveloper().testCode();
        }
        else if(typeProject.equalsIgnoreCase("java")){
            AbstractFactoryDeveloper abstractFactoryDeveloper=new JavaTeam();
            abstractFactoryDeveloper.createDeveloper().creatCode();
            abstractFactoryDeveloper.createTestDeveloper().testCode();

        }
        else{
            throw new RuntimeException("Таких разработчиков мы не знаем");
        }
    }
}
