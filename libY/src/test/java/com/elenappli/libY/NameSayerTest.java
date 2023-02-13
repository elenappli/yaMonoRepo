package com.elenappli.libY;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NameSayerTest {

  @Test
  public void given_serviceId_when_speak_then_printServiceNameWithId() {
    NameSayer.speak("a");
    NameSayer.speak("b");
  }
}
