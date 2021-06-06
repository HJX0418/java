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
		System.out.println("输入一个报文类型");
		String msgType = sc.next();
		while(!msgType.contains("#")){
			Iterator entries = map.entrySet().iterator();
			exist = false;
			while (entries.hasNext()) { //遍历配置的类型map
				Map.Entry entry = (Map.Entry) entries.next();
				String key = (String)entry.getKey();
				String value = (String)entry.getValue();
				if(key.equals(msgType)) {
					//通过反射机制创建value字符串对应的类实例，然后调用parse方法
					exist = true;
					Class clazz = Class.forName(value);
					IBaseParser parser = (IBaseParser)clazz.newInstance();
					parser.parse("this is a demo message");
					break;
				}				
			}
			if(!exist)
				System.out.println("没有配置对应的报文解析类，请重新输入");
			System.out.println("输入一个报文类型");
			msgType = sc.next();
		}
		
	}
}
