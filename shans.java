import java.util.Scanner;
public class shans {
  public static void main(String[] arg) {
      int y = 5;
      Scanner sc = new Scanner(System.in);
      System.out.println("Vvedite chislo:");
      int a = sc.nextInt();

      int c = a - y;

      if (c == 0) {
        System.out.println("True");
      } else {

        System.out.println("False");
        //Scanner s=new Scanner(System.in);
        System.out.println("Vvedite chislo zanavo:");
        int b = sc.nextInt();

        int d = b - y;

        if (d == 0) {
          System.out.println("True");
        } else {
          //Scanner scr=new Scanner(System.in);
          System.out.println("False");
          System.out.println("Vvedite chislo zanovo:");
          int k = sc.nextInt();

          int p = k - y;

          if (p == 0) {
            System.out.println("True");
          } else {
            System.out.println("False");
          }

        }
 }

}

}
