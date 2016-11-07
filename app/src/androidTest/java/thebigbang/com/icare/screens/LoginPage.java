package thebigbang.com.icare.screens;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;

import com.google.gson.Gson;

import org.hamcrest.Matchers;
import org.junit.Rule;

import java.io.InputStream;
import java.util.Scanner;

import thebigbang.com.icare.Activities.HomeScreenActivity;
import thebigbang.com.icare.R;
import thebigbang.com.icare.testData.ListingData;

import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.System.out;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.Matchers.startsWith;
import static org.hamcrest.core.IsAnything.anything;
import static org.hamcrest.object.HasToString.hasToString;

/**
 * Created by ericzhong on 25/10/16.
 */


public class LoginPage extends BasePage {

    /**
     * The constructor verifies that we are on the correct page by checking
     * the existence of the unique identifier elements of the page/view
     *
     * */



    public LoginPage(){


    }

    @Override
    public boolean isLoaded() {
        return false;
    }




    @Override
    public void load() {

        //do nothing

    }

    public void LoginPageTest() {
        onView(withId(R.id.action_search)).perform(click());
        onView(withId(R.id.etSearch)).perform(typeText("abc"),closeSoftKeyboard());

    }

    public void clickmenu()
    {
        onView(withId(R.id.itemMenu)).perform(click());
        onView(withText("About iCAre")).perform(click());

    }


    public void clickprofilebutton()
    {

        onView(withId(R.id.itemMenuInAboutIcare)).perform(click());
        onView(withText("User Profile")).perform(click());


    }

    public ServicePage ClickuserProfile(){

        onView(withId(R.id.tvUserProfileName)).perform(click());

        return new ServicePage();
    }


    public NewProfilePage StartNewProfile(){

        onView(withId(R.id.tvAddNew)).perform(click());

        return new NewProfilePage();
    }

    public void gotoiCareServices(){

        onData(anything()).inAdapterView(withId(R.id.lvProfile)).atPosition(4).perform(click());

        onView(withId(R.id.imvPersonalInfo)).perform(click());


    }




}