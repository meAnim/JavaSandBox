package animtry2;

import java.io.Serializable;

public class SingletonA implements Serializable{
		private static SingletonA soleInstance;
		
		private SingletonA() {
			if(soleInstance !=null) {
				throw new RuntimeException("Use the getInstance() methd");
			}
		}///reflectionSafe
		
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
		
		protected  Object readResolve() throws ClassNotFoundException {
			return getInstance();
		}
}
