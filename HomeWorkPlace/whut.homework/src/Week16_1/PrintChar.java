package Week16_1;

import java.text.SimpleDateFormat;

//���̣߳�����ͬʱʵ��main��ӡ�������ĸ
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
		//�߳���ʵ��������ʵ���̹߳���
		PrintChar myThread = new PrintChar();
		//Threadʵ����new�߳��壬�����̵߳�����
		Thread thread = new Thread(myThread);
			thread.start();
			while(true) 
			{
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}			
				System.out.println("main����");
			}
			
	}
}
