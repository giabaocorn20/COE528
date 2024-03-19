package coe528.lab1;

public abstract class Passenger {
    public String name;
    public int age;

    public Passenger(String name, int age){
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return name + ", " + age + " years old \n";
    }

    abstract double applyDiscount(double p);
}
