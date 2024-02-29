package com.directi.training.ocp.exercice_refactored;

public abstract class Ressource {
  public abstract void markFree(int resourceId);

  public abstract void markBusy(int resourceId);

  public abstract int findFree();
}
