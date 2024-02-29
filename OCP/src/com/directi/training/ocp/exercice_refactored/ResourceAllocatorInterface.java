package com.directi.training.ocp.exercice_refactored;

public interface ResourceAllocatorInterface {
    public abstract void free(int resourceId);
    public abstract void allocate();
}
