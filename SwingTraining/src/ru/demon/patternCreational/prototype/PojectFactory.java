package ru.demon.patternCreational.prototype;

public class PojectFactory {
    Project project;

    public PojectFactory(Project project) {
        this.project = project;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }
    Project cloneProject(){
        return (Project) project.copy();
    }
}
