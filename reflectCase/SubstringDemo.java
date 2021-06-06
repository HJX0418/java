package whut.info.reflectCase;

import javax.xml.bind.DatatypeConverter;

public class SubstringDemo {
	public static void main(String args[]) {
		String msg = "0A07E5060112403C8F5C28F5C28F3FE4CCCCCCCCCCCD";
		String msgType = msg.substring(0,2);
		System.out.println("msgType : " + msgType);
		
		String yearStr = msg.substring(2,6);
		byte[] yearArr = DatatypeConverter.parseHexBinary(yearStr);
		Short year = ByteArrayConveter.getShort(yearArr, 0);
		System.out.println("year : " + year);
		
		String monStr = msg.substring(6,8);
		byte[] monArr = DatatypeConverter.parseHexBinary(monStr);
//		int mon = ByteArrayConveter.getby(monArr, 0);
		int mon = monArr[0];
		System.out.println("mon : " + mon);
		
		String dayStr = msg.substring(8,10);
		byte[] dayArr = DatatypeConverter.parseHexBinary(dayStr);
//		int day = ByteArrayConveter.getInt(dayArr, 0);
		int day = dayArr[0];
		System.out.println("day : " + day);
		
		
		String hourStr = msg.substring(10,12);
		byte[] hourArr = DatatypeConverter.parseHexBinary(hourStr);
//		int hour = ByteArrayConveter.getInt(hourArr, 0);
		int hour = hourArr[0];
		System.out.println("hour : " + hour);
		
		String temperatureStr = msg.substring(12,28);
		byte[] temperatureArr = DatatypeConverter.parseHexBinary(temperatureStr);
		double temperature = ByteArrayConveter.getDouble(temperatureArr,0);
		System.out.println("temperature : " + temperature);
		
		String humidityStr = msg.substring(28,44);
		byte[] humidityArr = DatatypeConverter.parseHexBinary(humidityStr);
		double humidity = ByteArrayConveter.getDouble(humidityArr,0);		
		System.out.println("humidity : " + humidity);


		

	}

}
