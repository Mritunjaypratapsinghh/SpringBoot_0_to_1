package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

/**
 * Interface representing a Database service.
 * Provides a method to fetch data.
 */
public interface DB {
    /**
     * Retrieves data from the database.
     *
     * @return A string representing database data.
     */
    String getData();
}
