package com.facade.feed;

public class AnInterfaceImpl implements AnInterface {
    @FairThreadUsageByEntity(entityName = "XYXYXYX",
    numberOfThreads = 1)
    public Report getReport(final String One, final String Two) {
    	System.out.println("from object");
		return null;
    }
}