package pwo.lab10.observer;

import pwo.lab10.observer.Publisher.Subscriber;

public class AverageFinder implements Subscriber {
    
    Integer sum = null;

    @Override
    public void action(int x) {        
        sum = sum==null ? x : sum+x;
    }
    
    public int getAverage() { return (sum/3); }
}
