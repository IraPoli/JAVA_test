package org.example.java8.Collections;

import com.sun.source.tree.AssertTree;
import jakarta.ws.rs.core.MultivaluedHashMap;
import jakarta.ws.rs.core.MultivaluedMap;
import org.testng.Assert;

public class MultivaluedMaps {
    public static void tryMultivaluedMap(){
        MultivaluedMap<String, Integer> mulmap = new MultivaluedHashMap<>();
        mulmap.addAll("first", 1, 2, 3);
        mulmap.add(null, null);


        Assert.assertNotNull(mulmap, "The MultivaluedHashMap is null!");

        Assert.assertEquals(1, mulmap.getFirst("first"), "The key isn't mapped to the right values!");
        Assert.assertEquals(null, mulmap.getFirst(null), "MultivaluedHashMap didn't accept null!");


    };
}
