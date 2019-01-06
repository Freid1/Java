package ru.demon.patternStructual.decorator;

public class JavaTeamLead extends DeveloperDecorator {

    public JavaTeamLead(Developer developer) {
        super(developer);
    }
    public String sendWeekReport(){
        return "Send Week Report";
    }

    @Override
    public String makeJod() {
        return super.makeJod()+" "+sendWeekReport();
    }
}
