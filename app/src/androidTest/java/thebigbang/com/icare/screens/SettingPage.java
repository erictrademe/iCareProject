package thebigbang.com.icare.screens;


import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ericzhong on 26/10/16.
 */

public class SettingPage extends BasePage{


    public SettingPage(){


    }

    @Override
    public boolean isLoaded() {
        return false;
    }

    @Override
    public void load() {

    }

    public void ChangeSettings()

    {

        onView(withId(R.id.chbVaccineAlarm)).perform(click());
        onView(withId(R.id.chbDietChartAlert)).perform(click());
        onView(withId(R.id.chbAppointmentAlert)).perform(click());
        onView(withId(R.id.chbAlarmVibration)).perform(click());
        onView(withId(R.id.chbThemeChange)).perform(click());
        onView(withId(R.id.btnSaveOfSetting)).perform(click());



    }

}


