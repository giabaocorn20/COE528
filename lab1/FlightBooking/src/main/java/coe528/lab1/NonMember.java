package coe528.lab1;

class NonMember extends Passenger {
    public NonMember(String name, int age) {
        super(name, age);
    }

    @Override
    double applyDiscount(double p) {
        if (this.getAge() >65) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
