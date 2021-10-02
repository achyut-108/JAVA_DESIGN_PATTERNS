package designPatterns.behavioural.visitor;

public class FoodItem implements CartItem {

	@Override
	public int accept(CartItemVisitor visitor) {
		return CartItemVisitorImpl.getInstance().visit(this);
	}

}
