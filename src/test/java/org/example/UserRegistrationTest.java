package org.example;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistrationFormat userRegistration = new UserRegistrationFormat();
    @Test
    public void givenName_WhenProper_ShouldReturnTrue(){
        boolean result = userRegistration.firstName("Resh");
        Assert.assertTrue(result);
    }
}