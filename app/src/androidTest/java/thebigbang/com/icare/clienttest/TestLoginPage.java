package thebigbang.com.icare.clienttest;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.InputStream;
import java.util.List;
import java.util.Scanner;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import thebigbang.com.icare.Activities.HomeScreenActivity;

import thebigbang.com.icare.R;

import thebigbang.com.icare.screens.BasePage;
import thebigbang.com.icare.screens.LoginPage;
import thebigbang.com.icare.screens.NewProfilePage;
import thebigbang.com.icare.screens.ServicePage;
import thebigbang.com.icare.testData.ListingData;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static java.lang.System.out;

/**
 * Created by ericzhong on 25/10/16.
 */


public class TestLoginPage {

    private BasePage mCurrentPage = new LoginPage();
    private int flag =0;


    public boolean isExist(final int id)
    {
        try {
            onView(withId(id))
                    .check(matches(isDisplayed()));
            return true;
        } catch (AssertionError error) {
            return false;
        } catch (Exception e) {
            return false;
        }

    }



    @Rule
    public ActivityTestRule<HomeScreenActivity> mActivityRule = new ActivityTestRule<>(
            HomeScreenActivity.class);


    public TestLoginPage()
    {

        this.mActivityRule.launchActivity(new Intent());


    }



    @Before
    public void LoginAndClickMenu()
    {
       // mCurrentPage.is(LoginPage.class).LoginPageTest();
        mCurrentPage.is(LoginPage.class).clickmenu();
        mCurrentPage.is(LoginPage.class).clickprofilebutton();


       if (!isExist(R.id.tvUserProfileName)){


            mCurrentPage = mCurrentPage.is(LoginPage.class).StartNewProfile();
            mCurrentPage.is(NewProfilePage.class).FillProfile();

           try{
               Thread.sleep(1500);
           }catch(InterruptedException e){
               System.out.println("got interrupted!");
           }

           mCurrentPage = mCurrentPage.is(NewProfilePage.class).Save();

        }

        else

       {

           mCurrentPage = mCurrentPage.is(LoginPage.class).ClickuserProfile();
           flag = 1;


          // mCurrentPage = mCurrentPage.is(LoginPage.class).ClickuserProfile();

        }



    }

    @Test
    public void CheckServices()
    {
        if (flag == 0) {
            mCurrentPage = mCurrentPage.is(LoginPage.class).ClickuserProfile();
        }

            mCurrentPage.is(ServicePage.class).QuickTestServicesPage();


    }







/*
   @Test
    public void ClickMenu()
    {
        mCurrentPage.is(LoginPage.class).clickmenu();

    }*/


}
