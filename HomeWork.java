package xxx;

import java.text.DecimalFormat;

public class HomeWork {

	public static void main(String[] args) {

		HomeWork1 h1 = new HomeWork1();
		System.out.println(h1.mul(12, 6));  //積
		System.out.println(h1.sum(12, 6));  //和
		
		HomeWork22 h2 = new HomeWork22();
		h2.egg(200);
		
		HomeWork0424 h3 = new HomeWork0424();
//		h3.time(256559);
		
		HomeWork4 h4 = new HomeWork4();
		h4.circle(5);
		
		HomeWork5 h5 = new HomeWork5();
		h5.money( 1500000 , 0.02f , 10);
		
		HomeWork6 h6 = new HomeWork6(5,5);
		HomeWork6 h6a = new HomeWork6(5,'5');
		HomeWork6 h6b = new HomeWork6(5,"5");
	}

}

class HomeWork1{
	public int mul(int num1, int num2) {
		return num1*num2;
	}
	public int sum(int num1, int num2) {
		return num1+num2;
	}
}
class HomeWork22{
	public void egg(int eggs) {
		System.out.println(eggs/12+"打"+eggs%12+"顆");
	}
}
class HomeWork3{
	public void time(int sec) {
		int day = sec/86400 ;
		int hour = (sec - day*86400)/3600;
		int minute = (sec  - day*86400  -  hour*3600 )/60;
		int second = sec%60 ;
		System.out.println(day+"天"+hour+"時"+minute+"分"+second+"秒");
		
	}
}
class HomeWork4{
	public void circle(int rad) {
		final float pi=3.1415f;
		System.out.println("面積"+rad*rad*pi);
		System.out.println("周長"+2*rad*pi);
	}
}
class HomeWork5{
	public void money(double mon ,float rate,int year) {
		DecimalFormat    df   = new DecimalFormat("0.0000");  
		double sum = mon; 
		while(year>0) {
			sum = sum*(1+rate);
			year--;
		}
		System.out.println(df.format(sum));
	}
}
class HomeWork6{
	HomeWork6(int num1, int num2){
		System.out.println(num1+num2+"---數值相加");
	}
	HomeWork6(int num1, char num2){
		System.out.println(num1+num2+"---char的unicode(萬國碼)=53(十進位) 再與5相加");
	}
	HomeWork6(int num1, String num2){
		System.out.println(num1+num2+"---數字加字串輸出");
	}
}