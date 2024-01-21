package bytecode;

public class StringPractice {

  public static void main(String[] args) {

    String str1 = "hi";
    String str2 = " you";
    String str3 = " me";
    StringBuilder sb = new StringBuilder("hello");

    str1 = str1 + str2;
    sb.append(str3);
  }
}
