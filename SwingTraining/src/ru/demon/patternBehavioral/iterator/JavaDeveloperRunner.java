package ru.demon.patternBehavioral.iterator;

public class JavaDeveloperRunner {
    public static void main(String[] args) {
        String[] skills={"Spring","Hibernate","JDBC","Maven"};
        JavaDeveloper javaDeveloperRunner=new JavaDeveloper("Freid ",skills);
        Iterator iterator=javaDeveloperRunner.getIterator();
        System.out.println("Developer"+javaDeveloperRunner.getName());
        System.out.print("Skills: ");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
    }
}
