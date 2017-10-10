package DuckTypes;

import ConcreteDuckBehaviors.*;
import ConcreteDuckBehaviors.Float;
import DuckInterfaceBehaviors.FlyBehavior;
import DuckInterfaceBehaviors.QuackBehavior;
import DuckInterfaceBehaviors.SwimBehavior;

/**
 * Created by micheal on 10/10/2017.
 */
public class RubberDuck extends Duck{
    QuackBehavior quackBehavior = new Squeak();
    FlyBehavior flyBehavior = new CantFly();
    SwimBehavior swimBehavior = new Float();

    public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior, SwimBehavior swimBehavior){
        super(quackBehavior, flyBehavior, swimBehavior);
    }

    public String display() {
        return "I am a RubberDuck duck and I can " + quack() + ", " +  fly() + ", and " + swim() + "..!!";
    }

}
