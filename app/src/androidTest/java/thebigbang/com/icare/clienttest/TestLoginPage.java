package thebigbang.com.icare.clienttest;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import thebigbang.com.icare.Activities.HomeScreenActivity;
import thebigbang.com.icare.screens.BasePage;
import thebigbang.com.icare.screens.LoginPage;
import thebigbang.com.icare.screens.NewProfilePage;

/**
 * Created by ericzhong on 25/10/16.
 */


public class TestLoginPage {

    private BasePage mCurrentPage = new LoginPage();

    @Rule
    public ActivityTestRule<HomeScreenActivity> mActivityRule = new ActivityTestRule<>(
            HomeScreenActivity.class);


    public TestLoginPage()
    {

        this.mActivityRule.launchActivity(new Intent());

    }




    @Test
    public void LoginAndClickMenu()
    {
        mCurrentPage.is(LoginPage.class).LoginPageTest();
        //mCurrentPage.is(LoginPage.class).clickmenu();
        mCurrentPage = mCurrentPage.is(LoginPage.class).clickprofilebutton();
        mCurrentPage.is(NewProfilePage.class).FillProfile();
        mCurrentPage.is(NewProfilePage.class).Save();


    }


/*    @Test
    public void ClickMenu()
    {
        mCurrentPage.is(LoginPage.class).clickmenu();

    }
*/

}
