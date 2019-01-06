package ru.demon.patternBehavioral.chain;

public class SmsNotifier extends Notifier {
    public SmsNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String massage) {
        System.out.println("Sending SMS to manager: "+massage);
    }
}
