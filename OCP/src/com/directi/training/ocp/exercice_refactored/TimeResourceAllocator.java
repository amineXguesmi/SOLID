package com.directi.training.ocp.exercice_refactored;

public class TimeResourceAllocator implements ResourceAllocatorInterface{
    @Override
    public void free(int resourceId) {
        markTimeSlotFree(resourceId);
    }

    @Override
    public void allocate() {
        int resourceId = findFreeTimeSlot();
        markTimeSlotBusy(resourceId);
    }

    private void markTimeSlotFree(int resourceId)
    {
    }
    private void markTimeSlotBusy(int resourceId)
    {
    }

    private int findFreeTimeSlot()
    {
        return 0;
    }
}
