package com.marcelopazzo.tutorial.robolectric;

import android.widget.TextView;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

  private MainActivity activity;
  private TextView textView, fragmentTextView;

  public static final String GREETINGS = "Hello world!";

  @Before
  public void setUp() {
    activity = Robolectric.buildActivity(MainActivity.class).create().get();

    textView = (TextView) activity.findViewById(R.id.hello);
  }

  @Test
  public void shouldGreet() {
    assertEquals(GREETINGS, textView.getText());
  }

}
