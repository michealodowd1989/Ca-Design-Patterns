import ConcreteDuckBehaviors.*;
import ConcreteDuckBehaviors.Float;
import DuckTypes.*;

/**
 * Created by micheal on 10/10/2017.
 */
public class DuckMainSimulator {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck(new Quack(),new Fly(), new Swim());
        System.out.print(mallard.display());

        Duck rubberDuck = new RubberDuck(new Squeak(),new CantFly(), new Float());
        System.out.println("\n\n" + rubberDuck.display());
    }
}
