package test.espressospinnertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static test.espressospinnertest.helper.SpinnerTestHelper.testIntegerSpinner;

@RunWith(AndroidJUnit4.class)
public class SuccessTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule(MainActivity.class);

    @Test
    public void testClickOnElements(){
        testIntegerSpinner(R.id.spinner, 10);
    }
}