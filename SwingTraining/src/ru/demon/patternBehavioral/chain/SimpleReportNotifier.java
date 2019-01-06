package ru.demon.patternBehavioral.chain;

public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Notifier user simple report: "+massage);
    }
}
