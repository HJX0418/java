package whut.info.reflectCase;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class ConfigUtil {
	public static void main(String args[]) {
		Map map = new HashMap<>();
		map = readConfig("src/protocol.properties");

		Iterator entries = map.entrySet().iterator();

		while (entries.hasNext()) {
			Map.Entry entry = (Map.Entry) entries.next();
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			System.out.println("Key = " + key + ", Value = " + value);
		}

	}

	public static Map readConfig(String fileName) {
		Map map = new HashMap<>();
		Properties properties = new Properties();
		try {
			InputStream in = new BufferedInputStream(new FileInputStream(fileName));
			properties.load(in);
			Iterator iterator = properties.stringPropertyNames().iterator();
			while (iterator.hasNext()) {
				String key = (String) iterator.next();
				String value = properties.getProperty(key);
				map.put(key, value);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return map;
	}
}
