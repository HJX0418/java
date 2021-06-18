package Week16_1;

import java.text.SimpleDateFormat;

//多线程，可以同时实现main打印和输出字母
public class PrintChar implements Runnable {
	public void run(){
		char a = 'a';
		SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss ");
		while(true)
		{
			System.out.printf(dft.format(System.currentTimeMillis()));
			System.out.printf("%c\n",a);		    
			a++;
			if('z'+1 == a)
				a = 'a';	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}			
		}

	}
	public static void main(String[] args){
		//线程体实例，用于实现线程功能
		PrintChar myThread = new PrintChar();
		//Thread实例，new线程体，用于线程的启动
		Thread thread = new Thread(myThread);
			thread.start();
			while(true) 
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				System.out.println("main运行");
			}
			
	}
}
