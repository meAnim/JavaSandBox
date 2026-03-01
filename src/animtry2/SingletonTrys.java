package animtry2;

public class SingletonTrys {
	
	public enum EnumSing{
		INSTANCE;
		}
	
	
	public static void main(String[] args) {
		
		EnumSing singleton = EnumSing.INSTANCE;
		
	}

}
