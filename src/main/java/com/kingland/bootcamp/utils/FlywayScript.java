/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */
package com.kingland.bootcamp.utils;

import org.flywaydb.core.Flyway;
/**
 * @author KSC
 *
 * Use flyway complete data migrate.
 */
public class FlywayScript {

    public static void main(String[] args) {

        DatabaseProperties dbProperties = new DatabaseProperties();

        Flyway flyway = Flyway.configure().dataSource(dbProperties.getUrl(), dbProperties.getUsername(), dbProperties.getPassword()).load();

        // create flyway_schema_history table
		flyway.baseline();
        // check sql file
		flyway.validate();
        // complete data migrate
        flyway.migrate();
    }

}
