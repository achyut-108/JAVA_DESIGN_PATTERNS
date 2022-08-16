package designPatterns.behavioural.visitor;

public interface CartItemVisitor {
	
	int visit(BookItem bookItem);
	int visit(FoodItem foodItem);

}
