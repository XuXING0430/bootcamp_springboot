/**
 * Copyright 2020 Kingland Systems Corporation. All Rights Reserved.
 */

package com.kingland.bootcamp;

import com.kingland.bootcamp.utils.DatabaseProperties;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author KSC
 *
 * Test database properties values
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = DatabaseProperties.class)
public class DBPropertiesTest {

    @Autowired
    private DatabaseProperties databaseProperties;

    @Test
    public void testDataProperties() {
        Assert.assertEquals(databaseProperties.getUrl(), "jdbc:postgresql://localhost:5432/bootcamp");
        Assert.assertEquals(databaseProperties.getUsername(), "db.migration");
        Assert.assertEquals(databaseProperties.getPassword(), "pg123456");
    }

}
