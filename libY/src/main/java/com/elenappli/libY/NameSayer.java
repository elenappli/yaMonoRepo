package com.elenappli.libY;

public class NameSayer {
  private NameSayer() {}

  public static void speak(String id) {
    System.out.println("service-" + id);
  }
}
