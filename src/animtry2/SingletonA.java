package animtry2;
	
	public class SingletonA{
		private static SingletonA soleInstance;
		
		private SingletonA() {
			
		}
		
		public static SingletonA getInstance() {
			
			if(soleInstance == null) {
				synchronized(SingletonA.class) {
					if(soleInstance == null) {
						soleInstance = new SingletonA();
					}
				}
			}
			
			return soleInstance;
		}
}
