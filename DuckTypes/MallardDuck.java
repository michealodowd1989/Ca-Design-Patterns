package DuckTypes;

import ConcreteDuckBehaviors.*;
import DuckInterfaceBehaviors.*;

/**
 * Created by micheal on 10/10/2017.
 */
public class MallardDuck extends Duck{

    QuackBehavior quackBehavior = new Quack();
    FlyBehavior flyBehavior = new Fly();
    SwimBehavior swimBehavior = new Swim();

    public MallardDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior, SwimBehavior swimBehavior){
        super(quackBehavior, flyBehavior, swimBehavior);
    }

    public String display() {
        return "I am a Mallard duck and I can " + quack() + ", " +  fly() + ", and " + swim() + "..!!";
    }
}
