package ru.demon.patternStructual.composite;

import java.util.ArrayList;
import java.util.List;

public class TeamComposit {
    List<Developer> team =new ArrayList<>();

   public void addDeveloper(Developer developer){
        team.add(developer);
    }

    void removeDeveloper(Developer developer){
        team.remove(developer);
    }

    void createTeam(){
        for (Developer developer : team) {
            developer.writeCode();
        }
    }


}
