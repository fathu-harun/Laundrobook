package com.example.laundrobook;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Class<Object> appContext = null;
        assertEquals("com.example.laundrobook", appContext.getPackageName());
    }
}