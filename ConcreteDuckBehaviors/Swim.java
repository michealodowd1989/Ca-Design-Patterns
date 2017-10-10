package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.SwimBehavior;

/**
 * Created by micheal on 08/10/2017.
 */
public class Swim implements SwimBehavior {
    @Override
    public String swim() {
        return "Swim";
    }
}
