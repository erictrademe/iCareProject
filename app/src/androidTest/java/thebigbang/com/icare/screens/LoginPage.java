package thebigbang.com.icare.screens;
import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

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


    public void LoginPageTest() {
        onView(withId(R.id.action_search)).perform(click());
        onView(withId(R.id.etSearch)).perform(typeText("test"));

    }

    public void clickmenu()
    {
        onView(withId(R.id.itemMenu)).perform(click());
        onView(withText("About iCAre")).perform(click());

    }



}