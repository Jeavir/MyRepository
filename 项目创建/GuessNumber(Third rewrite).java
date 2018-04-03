import java.util.Random;
import java.util.Scanner;

public class CAIshuzhi {
	
public static void main(String []args){
	   

      
    	System.out.println("请输入你的昵称");
		String Playername;
            Scanner Gameplayer=new Scanner(System.in);
            String  PlayerName = Gameplayer.next();
		Scanner scann=new Scanner(System.in);
		
		Random radom=new Random();
		int AnserNumber=radom.nextInt(10);
		int i=1;
		   
	         System.out.println("请输入你要猜的数字");	
	         long startMili=System.currentTimeMillis();
	         for(;;){
	        	 
        	int GuessNumber=scann.nextInt();
			
				
			if(GuessNumber>AnserNumber){
				System.out.println("大了");
          i++;
			}else if(GuessNumber<AnserNumber){
			System.out.println("小了");
			i++;
			
		}else{	System.out.println("恭喜你猜对了，"+"亲爱的"+PlayerName+"同学，你一共猜了"+i+"次"); 
		        long endMili=System.currentTimeMillis();
		       
				System.out.println("总耗时为；"+(endMili-startMili)/1000+"秒");
		continue;
			
		}  
			
	}
				

       }
	
	         
	
	}
     
		
