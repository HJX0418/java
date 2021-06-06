package whut.info.reflectCase;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class MainParser {
	public static Map map = new HashMap<>();
	
	public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		map = ConfigUtil.readConfig("src/protocol.properties");

		Scanner sc = new Scanner(System.in);
		boolean exist = false;
		System.out.println("����һ����������");
		String msgType = sc.next();
		while(!msgType.contains("#")){
			Iterator entries = map.entrySet().iterator();
			exist = false;
			while (entries.hasNext()) { //�������õ�����map
				Map.Entry entry = (Map.Entry) entries.next();
				String key = (String)entry.getKey();
				String value = (String)entry.getValue();
				if(key.equals(msgType)) {
					//ͨ��������ƴ���value�ַ�����Ӧ����ʵ����Ȼ�����parse����
					exist = true;
					Class clazz = Class.forName(value);
					IBaseParser parser = (IBaseParser)clazz.newInstance();
					parser.parse("this is a demo message");
					break;
				}				
			}
			if(!exist)
				System.out.println("û�����ö�Ӧ�ı��Ľ����࣬����������");
			System.out.println("����һ����������");
			msgType = sc.next();
		}
		
	}
}
