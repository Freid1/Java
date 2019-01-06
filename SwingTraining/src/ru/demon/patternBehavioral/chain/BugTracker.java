package ru.demon.patternBehavioral.chain;

public class BugTracker {
    public static void main(String[] args) {
        Notifier simpleReport= new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailReport= new EmailNotifier(Priority.IMPORTENT);
        Notifier smsReport = new SmsNotifier(Priority.ASAP);

        simpleReport.setNextNotifier(emailReport);
        emailReport.setNextNotifier(smsReport);

        simpleReport.notifyManager("Its Ok",Priority.ROUTINE);
        simpleReport.notifyManager("Something wrong",Priority.IMPORTENT);
        simpleReport.notifyManager("We have problem.....",Priority.ASAP);
    }
}
