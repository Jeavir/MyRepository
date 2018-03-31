import java.util.Random;
import java.util.Scanner;

public class GuessNB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann=new Scanner(System.in);
		
		Random radom=new Random();
		int AnserNumber=radom.nextInt(1000);
		int i=1;
		
		
			
	       
	         System.out.println("请输入你要猜的数字");	
	         for(;;){
        	int GuessNumber=scann.nextInt();
			
				
			if(GuessNumber>AnserNumber){
				System.out.println("大了");
          i++;
			}else if(GuessNumber<AnserNumber){
			System.out.println("小了");
			i++;
			
		}else{if(GuessNumber==AnserNumber){
			System.out.println("猜对了"+"，你一个猜了"+i+"次"); 
			
		}
			
			
		      
		}
			
		}
		
		
		
	}
