package Week16_2;

import java.util.Random;
import java.text.SimpleDateFormat;

//������
public class GuoShanDong extends Thread{
	String name  = new String();
	int order = 0;
	SimpleDateFormat dft = new SimpleDateFormat("HH:mm:ss ");
	int time;	
	//ͬ������Ϊ�ٽ���������Ϊ�ٽ���Դ
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
			System.out.printf("�� %d ����ɽ������:%s ��ʱ��%ds\n",this.order,Thread.currentThread().getName(),this.time);					
		}
	}

	//ͬ������Ϊ�ٽ���
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pNames = {"����", "��˼", "����", "����", "����" }; 
		
		GuoShanDong GuoShanDong = new GuoShanDong();//����һ�μ��ɣ���������൱�ڶ��ɽ��
	
		//�Ⱥ�˳���˭��start�й�ϵ
	    for(int i=0;i<5;i++){     	
	    	new Thread(GuoShanDong,pNames[i]).start();
	    }

       
	}
 
}

