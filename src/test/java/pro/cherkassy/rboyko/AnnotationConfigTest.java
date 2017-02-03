package pro.cherkassy.rboyko;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pro.cherkassy.rboyko.beans.*;

import static org.junit.Assert.*;

/**
 * Created by rboyko on 03.02.17.
 */
public class AnnotationConfigTest {
    ApplicationContext context;
    @Before
    public void setUp() throws Exception {
        context=new ClassPathXmlApplicationContext("app-context.xml");
    }

    @Test
    public void testWinterTyres(){
        Tyres tyres=context.getBean("winterTyres", WinterTyres.class);
        assertEquals(tyres.getClass(),WinterTyres.class);
    }

    @Test
    public void testSummerTyres(){
        Tyres tyres=context.getBean("summerTyres", SummerTyres.class);
        assertEquals(tyres.getClass(),SummerTyres.class);
    }

    @Test
    public void testEngine(){
        Engine engine=context.getBean("engine",Engine.class);
        assertEquals(engine.getClass(),Engine.class);
    }

    @Test
    public void testWheels(){
        Wheels wheels=context.getBean("wheels",Wheels.class);
        assertEquals("Nokia 17d",wheels.toString());
    }

    @Test
    public void testCar(){
        Car car=context.getBean("car",Car.class);
        assertEquals("Engine:V5.6. Wheels:Nokia 17d",car.toString());
    }

}