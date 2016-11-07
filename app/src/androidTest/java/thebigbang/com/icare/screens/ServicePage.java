package thebigbang.com.icare.screens;

import android.support.test.espresso.Espresso;

import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ericzhong on 7/11/16.
 */

public class ServicePage extends BasePage {
    @Override
    public boolean isLoaded() {
        return true;
    }

    @Override
    public void load() {

    }

public void QuickTestServicesPage()
{

    onView(withId(R.id.imvPersonalInfo)).perform(click());
    onView(withId(R.id.tvPhoneInProfile)).check(matches(isDisplayed()));
    Espresso.pressBack();

    onView(withId(R.id.imvMedicalHistory)).perform(click());
    onView(withText("Health Conditions")).check(matches(isDisplayed()));
    Espresso.pressBack();

    onView(withId(R.id.imvDiet)).perform(click());
    onView(withId(R.id.tvAddNewDietPlan)).check(matches(isDisplayed()));
    Espresso.pressBack();


}







}
