package annotations;

import org.junit.Test;

import java.lang.annotation.Annotation;

import static org.junit.Assert.assertNotNull;

public class TestRower {

    //sprawdzic czy klasa ma annotations
    @Test
    public void findAdnotaion() {
        Rower rower = new Rower();
        Class clazz = rower.getClass();
        final Annotation annotation = clazz.getAnnotation(Pojazd.class);
        assertNotNull(clazz.getAnnotation(Pojazd.class));
    }
}
