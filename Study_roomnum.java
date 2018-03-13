package Study;

import java.util.Scanner;

public class Study_roomnum {

	public static void main(String[] args) {
		/* 문 제
		 * 플라스틱 숫자 세트로 자신의 방 번호를 붙이고 싶다.
		 * 플라스틱 숫자 1세트는 0~9까지 하나씩 있다.
		 * 방 번호가 주어졌을 때 필요한 세트의 최소값을 출력
		 * (6은 9로, 9는 6으로 사용할 수 있다.)
		*/
		
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("방 번호를 입력하세요");
		System.out.print("입력 :");
		n = sc.nextInt();
		int a,b,c,d,e,f,g;
		int s1=0,s2=0,s3=0,s4=0,s5=0,s6=0;
//		if(n>1000000) {
//			
//		}
		a = n/1000000;
		b = n%1000000/100000;
		c = n%1000000%100000/10000;
		d = n%1000000%100000%10000/1000;
		e = n%1000000%100000%10000%1000/100;
		f = n%1000000%100000%10000%1000%100/10;
		g = n%1000000%100000%10000%1000%100%10;
		
		int[] list = new int[] {a,b,c,d,e,f,g};
		for(int i = 0 ; i<=5; i=i+1) {
			if(list[0]==list[i+1]) {
				s1=s1+1;
			}
		}
		for(int j=0; j<=4;j++) {
			if(list[1]==list[j+2]) {
				s2=s2+1;
			}
		}
		for(int k=0; k<=3;k++) {
			if(list[2]==list[k+3]) {
				s3=s3+1;
			}
		}
		for(int l=0; l<=2; l++) {
			if(list[3]==list[l+4]) {
				s4=s4+1;
			}
		}
		for(int m=0; m<=1; m++) {
			if(list[4]==list[m+5]) {
				s5=s5+1;
			}
		}
		if(list[5]==list[6]) {
			s6=s6+1;
		}
		int result = Math.max(Math.max(s5, s6),Math.max(Math.max(s1, s2),Math.max(s3, s4)));
		System.out.println("result = " +(result+1) +"개가 필요함");
	}
//	현재 7자리 수를 모두 쳤을 때 맨 앞자리 수 가 0이어도 확인이 가능함
//	그러나 원하는 값은 1~10000000사이의 값이기 때문에 수정이 필요함
	
}

