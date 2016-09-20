package test.espressospinnertest;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static test.espressospinnertest.helper.SpinnerTestHelper.testIntegerSpinner;

@RunWith(AndroidJUnit4.class)
public class FailTest {
    @Rule
    public ActivityTestRule<FailActivity> mActivityRule = new ActivityTestRule(FailActivity.class);

    @Test
    public void testClickOnElements(){
        testIntegerSpinner(R.id.spinner, 10);
    }
}