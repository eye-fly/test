package pl.edu.mimuw;

import java.util.Arrays
public class Main {

  public static void main(String[] args) {
    final var template = new TemplateClass();
    final var greeting = template.getGreeting();
    System.out.println(greeting);
  }
}
