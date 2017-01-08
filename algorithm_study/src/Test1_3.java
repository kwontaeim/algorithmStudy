/*문제 1001
A-B를 계산하시오.

입력
첫째 줄에 A와 B가 주어진다. (0< A,B < 10)

출력
첫째 줄에 A-B를 출력한다.*/

public class Test1_3 {
  
 public static void main (String[] args) {
   
   java.util.Scanner keyScanner = new java.util.Scanner(System.in);
   
   String[] num = keyScanner.nextLine().split(" ");
   
   System.out.println(Integer.parseInt(num[0]) - Integer.parseInt(num[1]));
 
   keyScanner.close();
 
 }
 
 

}
