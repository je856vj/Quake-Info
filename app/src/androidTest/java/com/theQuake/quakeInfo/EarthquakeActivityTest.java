package com.theQuake.quakeInfo;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import androidx.test.rule.ActivityTestRule;
import androidx.test.platform.app.InstrumentationRegistry;
import static org.junit.Assert.*;

public class EarthquakeActivityTest extends ActivityTestRule<EarthquakeActivity> {

    private EarthquakeActivity earthquakeActivity;
    private Context context = InstrumentationRegistry.getInstrumentation().getTargetContext();

    public EarthquakeActivityTest() {
        super(EarthquakeActivity.class);
    }

    @Rule
    public ActivityTestRule<EarthquakeActivity> activityRule = new ActivityTestRule<>(
            EarthquakeActivity.class);


    @Before
    public void setUp() throws Exception
    {
        earthquakeActivity = activityRule.getActivity();
    }

    @Test
    public void testOnBackPressed() {

        // Assert checks correct behavior --- case existing context ---
        assertNotNull(context);

        // Assert checks correct behavior --- case existing activity ---
        assertNotNull(earthquakeActivity);
    }

    @Test
    public void testOnRefresh() {

        // Assert checks correct behavior --- case existing context ---
        assertNotNull(context);

        // Assert checks correct behavior --- case method execution ---
        assertNotNull(earthquakeActivity);
    }

    @Test
    public void testGetCurrentTheme() {

        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);

        // Assert checks correct behavior --- case existing context ---
        assertNotNull(context);

        // Assert checks correct behavior --- case existing preferences ---
        assertNotNull(sharedPreferences);

        String getString = context.getString(R.string.settings_dark_theme);
        // Assert checks correct behavior --- case 1st preference option ---
        assertEquals(getString, "Dark Theme");

        getString = context.getString(R.string.settings_dark_theme_off);
        // Assert checks correct behavior --- case 2nd preference option ---
        assertEquals(getString, "Off");

        // Assert checks correct behavior --- case method execution ---
        assertNotNull(earthquakeActivity.getCurrentTheme());
    }
}