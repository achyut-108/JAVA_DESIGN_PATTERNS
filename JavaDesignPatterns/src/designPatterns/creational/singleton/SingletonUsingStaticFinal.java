package designPatterns.creational.singleton;

public class SingletonUsingStaticFinal {
	
	private static final SingletonUsingStaticFinal SINGLETON_INSTANCE = new SingletonUsingStaticFinal();
	
	private SingletonUsingStaticFinal() {
	}
	
	public SingletonUsingStaticFinal getInstance() {
		return SINGLETON_INSTANCE;
	}

	
	public static void main(String[] args) {
		 
		System.out.println("class NAme : " + SINGLETON_INSTANCE.getClass().getName());
		
	}
	
}
