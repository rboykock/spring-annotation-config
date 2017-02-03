package pro.cherkassy.rboyko.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by rboyko on 02.02.17.
 */
@Component
public class WinterTyres extends Tyres {
    public WinterTyres(@Value("17")int size, @Value("Nokia")String name) {
        super(size, name);
    }
}
