import java.util.Scanner;

public class Study1_YMD {

	public static void main(String[] args) {
		/* 문 제
		 * 오늘은 1월 1일 월요일
		 * 2007년 x월 y일은 무슨 요일인지 확인해야 함
		 * (1,3,5,7,8,10,12 = 31일
		 * 4,6,9,1 = 30일
		 * 2월은 28일까지 있다.)
		 * */

		
		
		int x;
		int y;
		String[] day = new String[] {"MON", "TUE", "WED","THU","FRI","SAT","SUN"};
		int n=0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		System.out.print("(1<=x<=12) x = ");
		x = scan.nextInt();
		
		System.out.println("일을 입력하세요.");
		System.out.print("(1<=y<=31) y =");
		y = scan.nextInt();
		
		for(int i= 1; i<x; i=i+1) {
			n = n+28;
			if (i == 1|| i==3 || i==5 || i==7 || i==8 || i==10) {
				n=n+3;
			}
			else if(i==4||i==6||i==9||i==11) {
				n=n+2;
			}
		}
		n= n+y;
		int result = n%7;
		
		System.out.println("7로 나누었을 때 : " + result);
		System.out.println("day :  " + day[result]);
	}

}
