package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class Engine {

    protected double engineСapacity;

    public Engine( @Value("5.6") double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    public double getEngineСapacity() {
        return engineСapacity;
    }

    public void setEngineСapacity(double engineСapacity) {
        this.engineСapacity = engineСapacity;
    }

    @Override
    public String toString() {
        return "V"+Double.toString(engineСapacity);
    }
}
