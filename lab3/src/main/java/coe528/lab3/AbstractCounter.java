package coe528.lab3;

abstract class AbstractCounter implements Counter{
    public int value;
    public AbstractCounter(int value){
        this.value = value;
    }
    @Override
    public void increment(){
        value++;
    }
    @Override
    public void decrement(){
        value--;
    }
    @Override
    public void reset(){
        value = 0;
    }
    @Override
    public String count(){
        return Integer.toString(value);
    }
}
