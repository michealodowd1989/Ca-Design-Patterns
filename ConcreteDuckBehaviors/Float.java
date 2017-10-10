package ConcreteDuckBehaviors;

import DuckInterfaceBehaviors.SwimBehavior;

/**
 * Created by micheal on 10/10/2017.
 */
public class Float implements SwimBehavior{
    @Override
    public String swim() {
        return "I cant swim but, I can Float..!!";
    }
}
