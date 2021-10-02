package designPatterns.behavioural.visitor;

public class BookItem implements CartItem{

	@Override
	public int accept(CartItemVisitor visitor) {
		return CartItemVisitorImpl.getInstance().visit(this);
	}

}
