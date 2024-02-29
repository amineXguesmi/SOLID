package com.directi.training.ocp.exercice_refactored;

public class RessourceAllocator {

  public int allocate(Ressource resource) {
    int resourceId = resource.findFree();
    resource.markBusy(resourceId);
    return resourceId;
  }

  public void free(Ressource resource, int resourceId) {
    resource.markFree(resourceId);
  }
}
