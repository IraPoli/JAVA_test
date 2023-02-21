package org.example.patterns.behavioral.state;

public class RunStatePattern {



    public static void run() {

        Env env =  Env.RELEASE;
        // creating  - we can read from base
        Test ourFirst = new Test("Our", "Beta");
      //  Test ourFirst = new Test("Our", "Stable");
        System.out.println(ourFirst.name + " test has state  in creation-" + ourFirst.getState());

        // we need to execute beta test
        // for (int i = 0; i < 2; i++) {

        for (int i = 0; i < 4; i++) {
            State betaTest = new BetaTest((ourFirst));
            betaTest.run();
            System.out.println(ourFirst.name + " test has state -" + ourFirst.getState());

        }

        // when we need to execute stable test
        if (env==Env.RELEASE) {
            for (int i = 0; i < 3; i++) {
                StableTest stableTest = new StableTest(ourFirst);
                stableTest.run();
            }
        }
    }
}
