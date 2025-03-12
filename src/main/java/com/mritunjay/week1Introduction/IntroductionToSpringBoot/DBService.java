package com.mritunjay.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service layer to interact with the selected database implementation.
 * It injects a `DB` bean, which is resolved based on the environment.
 */
@Service
public class DBService {

    private final DB db;

    /**
     * Constructor-based dependency injection for `DB` implementation.
     *
     * @param db The database implementation injected by Spring.
     */

    public DBService(DB db) {
        this.db = db;
    }

    /**
     * Fetches data from the active database implementation.
     *
     * @return The database data string.
     */
    public String getData() {
        return db.getData();
    }
}
