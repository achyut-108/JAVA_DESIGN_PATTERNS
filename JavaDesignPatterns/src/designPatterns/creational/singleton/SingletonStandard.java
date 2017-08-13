package designPatterns.creational;

public class SingletonStandard {

	private SingletonStandard singletonStandard = null;
	
	private SingletonStandard() {
	}
	
	public SingletonStandard getInstance() {
		
		if(singletonStandard == null) {
			this.singletonStandard = new SingletonStandard();
		}
		
		return this.singletonStandard;
	}
}
