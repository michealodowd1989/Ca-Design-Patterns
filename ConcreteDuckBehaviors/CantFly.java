package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.FlyBehavior;

/**
 * Created by micheal on 10/10/2017.
 */
public class CantFly implements FlyBehavior {
    @Override
    public String fly() {
        return "I cant fly";
    }
}
