package coe528.lab3;

public class LinkedDigitCounter extends AbstractCounter{
    public Counter left;
    public LinkedDigitCounter(int value, Counter left) {
        super(value);
        this.left = left;
    }
    
    @Override
    public void increment(){
        if(value == 9){
            value = 0;
            if (left != null) {
                left.increment();
            }

        }else{
            value++;
        }
    }
    
    @Override
    public void decrement(){
        if(value == 0){
            value = 9;
            if (left != null) {
                left.decrement();
            }
        }else{
            value--;
        }
    }
    
    @Override
    public void reset(){
        value = 0;
        if (left != null) {
            left.reset();
        }
    }
}
