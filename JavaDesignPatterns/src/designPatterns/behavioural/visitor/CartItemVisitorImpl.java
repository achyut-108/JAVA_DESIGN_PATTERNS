package designPatterns.behavioural.visitor;

public class CartItemVisitorImpl implements CartItemVisitor {

	private static final CartItemVisitorImpl INSTANCE = new CartItemVisitorImpl();

	private CartItemVisitorImpl() {
	}

	public static final CartItemVisitorImpl getInstance() {
		return INSTANCE;
	}

	@Override
	public int visit(BookItem cartItem) {
		return 0;
	}

	@Override
	public int visit(FoodItem foodItem) {
		return 0;
	}

}