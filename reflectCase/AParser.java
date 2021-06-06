package whut.info.reflectCase;

public class AParser implements IBaseParser {
	public AParser() {
		System.out.println("new AParser instance");
	}
	public void parse(String s) {
		System.out.println("pase the message by A parser");
	}
}
