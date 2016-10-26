package thebigbang.com.icare.screens;

import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by ericzhong on 26/10/16.
 */

public class NewProfilePage extends BasePage{

    public NewProfilePage(){


    }

    public void FillProfile()
    {
        onView(withId(R.id.etName)).perform(typeText("test"),closeSoftKeyboard());
    }

    public void Save()
    {
        onView(withId(R.id.btnSave)).perform(click());
    }

}
