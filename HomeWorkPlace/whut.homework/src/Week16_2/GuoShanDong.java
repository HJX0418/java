package Week16_2;

import java.util.Random;
import java.text.SimpleDateFormat;

//任务类
public class GuoShanDong extends Thread{
	String name  = new String();
	int order = 0;
	SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss ");
	int time;	
	//同步语句块为临界区，对象即为临界资源
	public void run() {				
		synchronized (this) {
			Random r = new Random();
			time = r.nextInt(5)+5;
			try {
				Thread.sleep(1000*time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
			order ++;
			System.out.printf(dft.format(System.currentTimeMillis()));
			System.out.printf("第 %d 个过山洞的人:%s 用时：%ds\n",this.order,Thread.currentThread().getName(),this.time);					
		}
	}

	//同步方法为临界区
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pNames = {"张三", "李思", "王武", "柳柳", "周琦" }; 
		
		GuoShanDong GuoShanDong = new GuoShanDong();//创建一次即可，创建多次相当于多个山洞
	
		//先后顺序和谁先start有关系
	    for(int i=0;i<5;i++){     	
	    	new Thread(GuoShanDong,pNames[i]).start();
	    }

       
	}
 
}

