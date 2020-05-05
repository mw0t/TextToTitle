import java.util.Scanner;
import java.lang.Thread;

class Main {

  public static final String GREEN = "\u001B[32m";
  public static final String RESET = "\u001B[0m";

  public static void main(String[] args) {
    Scanner Text = new Scanner(System.in);
    System.out.print(GREEN+"\n\nEnter Your Text > "+RESET);

    String org= Text.nextLine();
      String [] temp=org.split(" ");
      int len=temp.length;
      String ne = ".";
       long start = System.currentTimeMillis();
       System.out.print("Your Title Is: ");
      for(int i=0;i<len;i++){
         temp[i]=temp[i].toUpperCase();
         temp[i]=(temp[i].substring(0, 1)).toUpperCase()+(temp[i].substring(1, temp[i].length())).toLowerCase();
         System.out.print(GREEN+temp[i]+" ");
      }
          long finish = System.currentTimeMillis();
          long timeElapsed = finish - start;
         System.out.print(RESET+"\n"+timeElapsed+" MilliSeconds");
         Runtime.getRuntime().addShutdownHook(new ShutdownHook());
        }
}