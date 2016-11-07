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

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ericzhong on 7/11/16.
 */

public class TestUpdatingProfile {

    private BasePage mCurrentPage = new ProfilePage();

    @Rule
    public ActivityTestRule<HomeScreenActivity> mActivityRule = new ActivityTestRule<>(
            HomeScreenActivity.class);


    public TestUpdatingProfile() {

        this.mActivityRule.launchActivity(new Intent());
    }

    @Before
    public void gotoProfileUpdating()
    {

        onView(withId(R.id.tvUserProfileName)).perform(click());
        onView(withId(R.id.imvPersonalInfo)).perform(click());


    }


        @Test
        public void TestUpdateUserProfile(){

            mCurrentPage.is(ProfilePage.class).UpdateProfile();

        }
    }


