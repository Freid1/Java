package ru.demon.patternBehavioral.strategy;

public class Developer {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public  void execute(){
        activity.justDoIt();
    }
}
