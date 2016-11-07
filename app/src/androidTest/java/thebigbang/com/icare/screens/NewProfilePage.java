package thebigbang.com.icare.screens;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.contrib.PickerActions;
import android.support.test.espresso.matcher.RootMatchers;
import android.widget.DatePicker;
import android.widget.TextView;

import org.hamcrest.Matchers;

import thebigbang.com.icare.Activities.HomeScreenActivity;
import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by ericzhong on 26/10/16.
 */

public class NewProfilePage extends BasePage{

    public NewProfilePage(){


    }

    @Override
    public boolean isLoaded() {

        return false;

        }

    @Override
    public void load() {

    }

    public void FillProfile()
    {
        onView(withId(R.id.etName)).perform(typeText("12test"),closeSoftKeyboard());
        onView(withId(R.id.rbFemale)).perform(click());
        onView(withId(R.id.etDateofBirth)).perform(click());
        onView(withContentDescription("Next month")).perform(click());
        onView(withClassName(Matchers.equalTo(DatePicker.class.getName()))).perform(PickerActions.setDate(2016,12,28));
        onView(withText("OK")).perform(click());
        onView(withId(R.id.spBloodGroup)).perform(click());
        onView(withText("O+")).perform(click());

        onView(withId(R.id.spBP)).perform(click());
        onView(withText("Low")).perform(click());

        onView(withId(R.id.etWeight)).perform(typeText("120"),closeSoftKeyboard());
        onView(withId(R.id.etHeight)).perform(typeText("180"),closeSoftKeyboard());
        onView(withId(R.id.etEmail)).perform(typeText("test@gmail.com"),closeSoftKeyboard());
        onView(withId(R.id.etPhone)).perform(typeText("0221234567"),closeSoftKeyboard());



    }

    public LoginPage Save()
    {
        onView(withId(R.id.btnSave)).perform(click());



        return new LoginPage();
    }


}


