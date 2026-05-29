package com.Krce.tests;

import com.Krce.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest {

    @Test
    public void verifyHomepageLaunch() {
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
        Assert.assertTrue(title.contains("Automation Exercise"),
                "Homepage title mismatch!");
    }
}