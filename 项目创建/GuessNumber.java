import java.util.Random;
import java.util.Scanner;

public class GuessNB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann=new Scanner(System.in);
		Scanner Mit=new Scanner(System.in);
		Random radom=new Random();
		int AnserNumber=radom.nextInt(1000)+1;
		int i=1;
		
		
			System.out.println("请输入你要猜的次数");				
	         int n=Mit.nextInt();
	         System.out.println("请输入你要猜的数字");	
	         for(;;){
        	int GuessNumber=scann.nextInt();
			
				
			if(GuessNumber>AnserNumber&&i<=n){
				System.out.println("大了");
          i++;
			}else if(GuessNumber<AnserNumber&&i<=n){
			System.out.println("小了");
			i++;
			
		}else{if(GuessNumber==AnserNumber){
			System.out.println("猜对了");
			
		}else{
			System.out.println("算了算了，你那么笨就不要猜了");
		}
			
			
			
		      
		}
			
		}
		
		
		
	}
}
		
	


