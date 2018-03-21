package ru.demon.patternCreational.prototype;

public class Project implements CopyType {
    private int id;
    private String name;
    private String sourceCod;

    public Project(int id, String name, String sourceCod) {
        this.id = id;
        this.name = name;
        this.sourceCod = sourceCod;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCod() {
        return sourceCod;
    }

    public void setSourceCod(String sourceCod) {
        this.sourceCod = sourceCod;
    }

    @Override
    public String toString() {
        return id+"  "+name+" "+sourceCod;
    }

    @Override
    public Object copy() {
        Project copy=new Project(id,name,sourceCod);
        return copy;
    }
}
