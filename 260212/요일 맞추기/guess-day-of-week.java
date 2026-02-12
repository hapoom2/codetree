import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        
        int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] week = { "Tue", "Wed", "Thu", "Fri", "Sat","Sun","Mon"};
        String[] Rweek = {"Mon","Sun","Sat","Fri","Thu","Wed","Tue"};
        int days = 0;
        String ans;
        if(m1<m2||(m1==m2&&d1<d2)) {
	        for(int i=m1;i<m2;i++){
	            days += month[i];
	        }
	
	        days = days + d2 - d1;
	        ans = week[days%7];
        }
        else {
        	for(int i=m2;i<m1;i++){
	            days += month[i];
	        }
	
	        days = days + d1 - d2;
	        ans = Rweek[days%7];
        }
        

        System.out.println(ans);
	}

}