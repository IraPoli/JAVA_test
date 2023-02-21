package org.example.patterns.behavioral.state;

import java.util.Objects;

public class Test{
    String name;
    private State state;
    int passedTimes;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Test(String name,String state) {
        this.name = name;
        passedTimes = 0;
        if (Objects.equals(state, "Stable")){
            this.state = new StableTest(this);
        }else {this.state = new BetaTest(this);}
    }

}
