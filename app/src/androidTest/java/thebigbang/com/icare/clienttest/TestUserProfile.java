package thebigbang.com.icare.clienttest;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import thebigbang.com.icare.Activities.HomeScreenActivity;
import thebigbang.com.icare.R;
import thebigbang.com.icare.screens.BasePage;
import thebigbang.com.icare.screens.ProfilePage;
import thebigbang.com.icare.screens.ServicePage;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ericzhong on 7/11/16.
 */

public class TestUserProfile {

    private BasePage mCurrentPage = new ProfilePage();

    @Rule
    public ActivityTestRule<HomeScreenActivity> mActivityRule = new ActivityTestRule<>(
            HomeScreenActivity.class);


    public TestUserProfile(){

        this.mActivityRule.launchActivity(new Intent());

    }

    @Before
    public void gotoProfile()
    {

        mCurrentPage = mCurrentPage.is(ProfilePage.class).gotoprofile();


    }

    @Test
    public void TestUserProfile()
    {

        mCurrentPage.is(ProfilePage.class).UpdateProfile();
    }



}
