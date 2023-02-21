package org.example.patterns.behavioral.state;

public class BetaTest extends State {
    public BetaTest(Test test) {
        super(test);
    }

    @Override
    public void run() {
            System.out.println("execute BETA test " + test.name);
            test.passedTimes++;
            if (test.passedTimes >= 3) {
                test.setState(new StableTest(test));
            }
    }
}
