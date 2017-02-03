package pro.cherkassy.rboyko.beans;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class Car {

    @Autowired
    protected Wheels wheels;
    @Autowired
    protected Engine engine;


    public Car(Engine engine, Wheels wheels) {
        this.engine = engine;
        this.wheels = wheels;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Engine:"+engine+". Wheels:"+wheels;
    }
}
