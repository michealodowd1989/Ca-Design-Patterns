package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.QuackBehavior;

/**
 * Created by micheal on 08/10/2017.
 */
public class Quack implements QuackBehavior {
    @Override
    public String quack() {
        return "Quack";
    }
}
