public class Main {
  public static void main(String[] args) {
    System.out.println("Enter your political party [d|r|i]:");
    String party = "o";
    if (party.equalsIgnoreCase("d")) {
      System.out.println("You get a donkey");
    } else if (party.equalsIgnoreCase("r")) {
      System.out.println("You get an elephant");
    } else if (party.equalsIgnoreCase("i")) {
      System.out.println("You get a person");
    } else {
      System.out.println("You get other");
    }

  }
}