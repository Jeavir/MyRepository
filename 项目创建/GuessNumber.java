import java.util.Random;
import java.util.Scanner;

public class GuessNB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scann=new Scanner(System.in);
		Scanner  Mit=new Scanner(System.in);
		Random radom=new Random();
		int AnserNumber=radom.nextInt(1000);
		int i=1;
		
		
			System.out.println("��������Ҫ�µĴ���");				
	         int n=Mit.nextInt();
	         System.out.println("��������Ҫ�µ�����");	
	         for(;;){
        	int GuessNumber=scann.nextInt();
			
				
			if(GuessNumber>AnserNumber&&i<=n){
				System.out.println("����");
          i++;
			}else if(GuessNumber<AnserNumber&&i<=n){
			System.out.println("С��");
			i++;
			
		}else{if(GuessNumber==AnserNumber&&i<=n){
			System.out.println("�¶���"+"����һ������"+i+"��"); 
			
		}else{
			System.out.println("���Ѿ��������޶��²����"+n+"��");
		}
			
			
			
		      
		}
			
		}
		
		
		
	}
}
		