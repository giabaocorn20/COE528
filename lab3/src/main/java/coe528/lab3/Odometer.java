package coe528.lab3;

public class Odometer implements Counter {
    private final int numberOfDigits;
    private final AbstractCounter[] counters;
    // The counters for the digits use the AbstractCounter (since its a superclass and can store any subclass of it)

    public Odometer(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Odometer must have at least one digit.");
        }
        this.numberOfDigits = n;
        this.counters = new AbstractCounter[numberOfDigits];
        
        counters[0] = new DigitCounter(0); //The first counter is a DigitCounter
        for (int i = 1; i < numberOfDigits; i++) {
            counters[i] = new LinkedDigitCounter(0, counters[i - 1]);
            //The counters are linked together by using their indexes, therefoire the left counter must be downcasted to a LinkedDigitCounter
        }
    }

    @Override
    public String count() {
        String result = "";
        for (int i = 0; i < numberOfDigits; i++) {
            result += counters[i].count();
        }
        return result;
    }

    @Override
    public void increment() {
        counters[numberOfDigits - 1].increment();
    }

    @Override
    public void decrement() {
        counters[numberOfDigits - 1].decrement();
    }

    @Override
    public void reset() {
        for (int i = 0; i < numberOfDigits; i++) {
            counters[i].reset();
        }
    }
}
