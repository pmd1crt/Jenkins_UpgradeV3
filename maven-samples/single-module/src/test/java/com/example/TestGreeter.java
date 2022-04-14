package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.matchers.GreaterThan;
import org.mockito.internal.matchers.LessThan;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class TestGreeter {

  private Greeter greeter;

  @Before
  public void setup() {
    greeter = new Greeter();
  }

  @Test
  public void greetShouldIncludeTheOneBeingGreeted() {
    String someone = "World";

    assertThat(greeter.greet(someone), containsString(someone));
  }

  @Test
  public void greetShouldIncludeGreetingPhrase() {
    String someone = "Hello World";

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

    
    @Test
<<<<<<< HEAD
<<<<<<< HEAD
  public void greetShouldIncludeGreetingMessage() {
    String someone = "Hello World, Its me Pankti. Thanks you making me Happy";
=======
  public void greetShouldIncludeGreetingPhase() {
    String someone = "Hello World, Thanks you";
=======
  public void greetShouldIncludeGreetingMessage1() {
    String someone = "Hello World, It's me Pankti.Thanks you";
>>>>>>> c79e40f0cd419450940cd1d4b798f83e5383cfff

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }

@Test
  public void greetShouldIncludeGreetingMes() {
    String someone = "Hello World, Its me Pankti. Thanks you for making me happy";
>>>>>>> beedde4329bc82aca31c90c7d383105451470150

    assertThat(greeter.greet(someone).length(), is(greaterThan(someone.length())));
  }
}
