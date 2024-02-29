package com.directi.training.ocp.exercice_refactored;

public class SpaceResourceAllocator implements ResourceAllocatorInterface{
    @Override
    public void free(int resourceId) {
        markSpaceSlotFree(resourceId);
    }

    @Override
    public void allocate() {
        int resourceId = findFreeSpaceSlot();
        markSpaceSlotBusy(resourceId);
    }
    private void markSpaceSlotFree(int resourceId)
    {
    }
    private void markSpaceSlotBusy(int resourceId)
    {
    }

    private int findFreeSpaceSlot()
    {
        return 0;
    }
}
