package thebigbang.com.icare.clienttest;

import android.content.Intent;
import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;


import thebigbang.com.icare.Activities.SettingActivity;
import thebigbang.com.icare.screens.BasePage;
import thebigbang.com.icare.screens.SettingPage;


/**
 * Created by ericzhong on 26/10/16.
 */

public class TestSettingPage {

    private BasePage mCurrentPage = new SettingPage();

    @Rule
    public ActivityTestRule<SettingActivity> mActivityRule = new ActivityTestRule<>(
            SettingActivity.class);


    public TestSettingPage()
    {


    }






    @Test
    public void CheckUserProfile()
    {
        mCurrentPage.is(SettingPage.class).ChangeSettings();

    }



}
