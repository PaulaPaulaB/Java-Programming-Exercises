package lambdas;

//We can define function interface which takes two arguments and returns one
@FunctionalInterface
public interface Function {

    Integer call(Integer a, Integer b);

}
