package lambdas;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lambdas {

    @Test
    public void whatIsLambda() {

        //implementation of bird interface
        Bird birdImpl = new BirdImpl();

        //in java 7 you can create instance of interface anonymously
        Bird anonymousBird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Anonymous bird flying");
            }
        };

        //in java 8 you can create instance using lambda expression
        Bird lambdaBird = () -> {
            System.out.println("Lambda bird flying!");
        };

        birdImpl.fly();
        anonymousBird.fly();
        lambdaBird.fly();

        //we can pass lambdas like any other objects to methods, like below:
        BirdMaster.letItFly(birdImpl);
        BirdMaster.letItFly(anonymousBird);
        BirdMaster.letItFly(lambdaBird);

        //but as well we can define lambda ad-hoc like below:
        BirdMaster.letItFly(() -> System.out.println("Another lambda bird is flying!"));
        BirdMaster.letItFly(() -> System.out.println("wow!!"));

        //And using old anonymous implementation as well!
        BirdMaster.letItFly(new Bird() {
            @Override
            public void fly() {
                System.out.println("And using old anonymous implementation as well!");
            }
        });

    }

    @Test
    public void whatIsClosure() {
        //if we use variable inside lambda which is not in scope of function we call it closure (domknięcie)
        String name = "Kowalik";
        Bird clousureBird = () -> {
            System.out.println(name + " bird flying!");
        };
        clousureBird.fly();
    }

    @Test
    public void functionTest() {
        //creating function which just adds two arguments and returns sum
        Function function = (a, b) -> (a + b);
        final Integer sum = function.call(1, 2);
        assertEquals(new Integer(3), sum);

        //or just multipy
        Function function2 = (a, b) -> (a * b);
        final Integer result = function2.call(1, 2);
        assertEquals(new Integer(2), result);
    }


    @Test
    public void function2Test() {
        //create functional interface which receives Integer argument and return Double
        //using lambda expression create function which computes area of disk assuming that argument is disk radius
        //1. create function interface
        //2. create lambda
        Function3 function2 = (a) -> (a * a * Math.PI);
        //3. compute area
        final Double circusArea = function2.countArea(2);
        assertEquals(new Double(4 * Math.PI), circusArea);
        //TIP : use PI Constant from Math.PI

        Function2 areaCompute = (r) -> (Math.PI * r * r);

        final Double compute = areaCompute.compute(4);
        System.out.println(compute);

        java.util.function.Function<Integer, Double> f1 = integer -> (Math.PI * integer * integer);
        final Double apply = f1.apply(4);
        System.out.println(apply);
    }

}
