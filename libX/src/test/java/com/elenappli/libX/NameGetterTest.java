package com.elenappli.libX;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameGetterTest {

    @Test
    public void given_serviceId_when_getServiceName_then_returnServiceNameWithId() {
        String actualServiceNameA = NameGetter.getServiceName("a");
        assertEquals("service-a", actualServiceNameA);

        String actualServiceNameB = NameGetter.getServiceName("b");
        assertEquals("service-c", actualServiceNameB);
    }

}