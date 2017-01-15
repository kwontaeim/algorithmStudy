/*문제 1008번 
두 수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 A와 B가 주어진다. (0 < A,B < 10)

출력
첫째 줄에 A/B를 출력한다.*/


public class Test2_4 {
  
  public static void main (String[] args) throws Exception {
 
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        String[] num = sc.nextLine().split(" ");

        System.out.println((double)Integer.parseInt(num[0]) / (double)Integer.parseInt(num[1]));
            
        sc.close();
            
                
        
  }

}
