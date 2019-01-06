package ru.demon.patternBehavioral.observer;

public class Jobsearch {
    public static void main(String[] args) {
        JavaDeveloperJobSite javaDeveloperJobSite=new JavaDeveloperJobSite();
        javaDeveloperJobSite.addVacancies("First");
        javaDeveloperJobSite.addVacancies("Second");

        Observer firstSubscribe=new Subscriber("Freid");
        Observer secondSubscribe=new Subscriber("Ivan");

        javaDeveloperJobSite.addObserver(firstSubscribe);
        javaDeveloperJobSite.addObserver(secondSubscribe);

        javaDeveloperJobSite.addVacancies("Therd");

        javaDeveloperJobSite.removeVacancy("Therd");

    }
}
