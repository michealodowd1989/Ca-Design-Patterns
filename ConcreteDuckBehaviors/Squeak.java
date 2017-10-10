package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.QuackBehavior;

/**
 * Created by micheal on 10/10/2017.
 */
public class Squeak implements QuackBehavior {
    @Override
    public String quack() {
        return "Squeak";
    }
}

