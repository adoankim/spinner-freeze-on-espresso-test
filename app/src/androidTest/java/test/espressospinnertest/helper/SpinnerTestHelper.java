package test.espressospinnertest.helper;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withSpinnerText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;

public class SpinnerTestHelper {

    public static void testIntegerSpinner(int spinnerId, int integerTest) {
        onView(withId(spinnerId)).perform(click());
        onData(allOf(is(instanceOf(Integer.class)), is(integerTest)))
                .inRoot(isPlatformPopup())
                .perform(click());
        onView(withId(spinnerId)).check(matches(withSpinnerText(""+ integerTest)));
    }
}
