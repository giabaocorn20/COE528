package coe528.lab3;

public class DigitCounter extends AbstractCounter{
    public DigitCounter(int value){
        super(value);
    }
    @Override
    public void increment(){
        if(value == 9){
            value = 0;
        }else{
            value++;
        }
    }
    @Override
    public void decrement(){
        if(value == 0){
            value = 9;
        }else{
            value--;
        }
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
