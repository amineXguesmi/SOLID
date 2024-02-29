package com.directi.training.lsp.exercice_refactored;

public class ElectricDuck implements OperationalDuck {
  private boolean _on = false;

  @Override
  public void quack() {
    if (_on) {
      System.out.println("Electronic duck quack...");
    } else {
      throw new IllegalStateException("Electronic duck is off");
    }
  }

  @Override
  public void swim() {
    if (_on) {
      System.out.println("Electronic duck swim");
    } else {
      throw new IllegalStateException("Electronic duck is off");
    }
  }

  @Override
  public void turnOn() {
    _on = true;
  }

  @Override
  public void turnOff() {
    _on = false;
  }
}