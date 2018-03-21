package ru.demon.patternCreational.prototype;

public class MainMethod {
    public static void main(String[] args) {


        Project newProject = new Project(15, "HttpProject", "I dont no English");

        System.out.println(newProject);

        PojectFactory pojectFactory = new PojectFactory(newProject);
        Project copyNewProject = pojectFactory.cloneProject();

        System.out.println(copyNewProject);
    }


}
