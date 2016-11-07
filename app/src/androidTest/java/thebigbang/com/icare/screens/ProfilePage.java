package thebigbang.com.icare.screens;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.contrib.PickerActions;
import android.widget.DatePicker;

import org.hamcrest.Matchers;

import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by ericzhong on 7/11/16.
 */

public class ProfilePage extends BasePage {
    @Override
    public boolean isLoaded() {
        return false;
    }

    @Override
    public void load() {

    }

    public ProfilePage gotoprofile(){

        onView(withId(R.id.tvUserProfileName)).perform(click());
        onView(withId(R.id.imvPersonalInfo)).perform(click());

        return new ProfilePage();

    }
    public void UpdateProfile(){
        onView(withId(R.id.tvEditPersonalInfoInProfile)).perform(click());

        onView(withId(R.id.etDateofBirth)).perform(click());
        onView(withContentDescription("Next month")).perform(click());
        onView(withClassName(Matchers.equalTo(DatePicker.class.getName()))).perform(PickerActions.setDate(2016,12,01));
        onView(withText("OK")).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.etPhone)).perform(clearText());
        onView(withId(R.id.etPhone)).perform(typeText("01234567"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.btnSave)).perform(click());



        onView(withId(R.id.tvEditPersonalInfoInProfile)).perform(click());
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.etPhone)).perform(clearText());
        onView(withId(R.id.etPhone)).perform(typeText("07654321"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.btnSave)).perform(click());

        onView(withText("07654321")).check(matches(isDisplayed()));






    }
}
