package com.facade.feed;


public interface AnInterface {
    String BEAN_NAME = "AnInterface";   //used for injection in spring.
    Report getReport(final String One, final String two);
}
