package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.FlyBehavior;

/**
 * Created by micheal on 08/10/2017.
 */
public class Fly implements FlyBehavior {
    @Override
    public String fly() {
        return "Fly";
    }
}
