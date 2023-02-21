package org.example.patterns.behavioral.state;

public class StableTest extends State {
    public StableTest(Test test) {
        super(test);
    }

    @Override
    public void run() {
        if (test.getState() instanceof StableTest) {

            System.out.println("execute STABLE test " + test.name);
            //if test fail
            test.passedTimes = 0;
            if (test.passedTimes == 0) {
                test.setState(new BetaTest(test));
            }
        } else {
            System.out.println("test was skipped"+ test.name+" as not stable");
        }
    }

}
