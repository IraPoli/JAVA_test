package org.example.patterns.behavioral.state;

public abstract class State {
 Test test;
 State(Test test) {
  this.test = test;
 }
 public abstract void run();
}


