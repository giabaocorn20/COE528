package coe528.lab1;

class Member extends Passenger {
    private final int yearsOfMembership;
    public Member(String name, int age, int yearsOfMembership) {
        super(name, age);
        this.yearsOfMembership = yearsOfMembership;
    }

    @Override
    double applyDiscount(double p) {
        if (yearsOfMembership > 5) {
            return p * 0.5;
        } else if (yearsOfMembership > 1) {
            return p * 0.9;
        } else {
            return p;
        }
    }
}
