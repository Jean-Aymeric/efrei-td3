import sample.AbstractFoo;
import sample.Bar;
import sample.Foo;

public class Main {
    public static void main(String[] args) {
        AbstractFoo foo = new Foo();
        AbstractFoo bar = new Bar();

        foo.doSomething();
        bar.doSomething();
    }
}