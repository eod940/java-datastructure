package sorting;

public class Main {

  public static Chrome heySuzin() {
    return new Chrome("suzin");
  }

  public static void main(String[] args) {
    Chrome chrome1 = new Chrome("suzin");
    Chrome chrome2 = new Chrome("suzin");

    System.out.println(chrome1.equals(chrome2));  // false!!
    System.out.println(chrome1 == chrome2);  // false!!


    Chrome chrome3 = heySuzin();
    Chrome chrome4 = heySuzin();

    System.out.println(chrome3.equals(chrome4));  // false!!
    System.out.println(chrome3 == chrome4);  // false!!
  }
}
