/*문제 10430번 
(A+B)%C는 (A%C + B%C)%C 와 같을까?

(A×B)%C는 (A%C × B%C)%C 와 같을까?

세 수 A, B, C가 주어졌을 때, 위의 네가지 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)

출력
첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다.*/

public class Test2_6 {
  
  public static void main (String[] args) {
    
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    String[] num = sc.nextLine().split(" ");
    
    int num1 = Integer.parseInt(num[0]);
    int num2 = Integer.parseInt(num[1]);
    int num3 = Integer.parseInt(num[2]);
    
  System.out.println((num1+num2)%num3);
  System.out.println(((num1%num3)+(num2%num3))%num3);
  System.out.println((num1*num2)%num3);
  System.out.println(((num1%num3)*(num2%num3))%num3);
  
    
    
    sc.close();
    
  }

}
