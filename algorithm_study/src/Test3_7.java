
public class Test3_7 {
  
  public static void main(String[] args) {
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    String[] str = sc.nextLine().split(" ");
    
    int num1 = Integer.parseInt(str[0]);
    int num2 = Integer.parseInt(str[1]);
    int date = 0;
    
    
    for (int i = 1; i < num1; i++) {
    if (num1 == 1) {
     break;
    } else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
        date += 31;
      } else if (i == 4 || i == 6 || i == 9 || i == 11) {
        date += 30;
      } else if (i == 2) {
        date += 28;
      }
    System.out.println(date);
    }
    
    date += num2;
    System.out.println(date);
    int day = date % 7;
    System.out.println(day);
   
    switch (day) {
    case 0 : System.out.print("SUN"); break;
    case 1 : System.out.print("MON"); break;
    case 2 : System.out.print("THU"); break;
    case 3 : System.out.print("WED"); break;
    case 4 : System.out.print("THU"); break;
    case 5 : System.out.print("FRI"); break;
    case 6 : System.out.print("SAT"); break;
    }
    
    sc.close();
    
  }

}
