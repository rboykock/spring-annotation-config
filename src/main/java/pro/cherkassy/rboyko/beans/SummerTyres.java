package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class SummerTyres extends Tyres {
    public SummerTyres(@Value("18")int size, @Value("Rossava")String name) {
        super(size, name);
    }
}
