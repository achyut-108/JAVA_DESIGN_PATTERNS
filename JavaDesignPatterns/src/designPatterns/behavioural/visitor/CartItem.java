package designPatterns.behavioural.visitor;

public interface CartItem {
	
	int accept(CartItemVisitor visitor);

}
