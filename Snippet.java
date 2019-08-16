package Eshop;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* Class designed for requirement 1, add code wherever applicable as per requirement given */
class OrderDetails {
	private static final Logger LOG = Logger.getLogger("OrderDetails");

	// member variables
	private String itemName;
	private float itemCost;
	private int quantity;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemCost() {
		return itemCost;
	}

	public void setItemCost(float itemCost) {
		this.itemCost = itemCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public OrderDetails(String itemName, float itemCost, int quantity) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
		this.quantity = quantity;
	}

	public OrderDetails() {
	}

	public void printMessage(int quantity) {

		switch (quantity) {

		case 1:
			LOG.info("You have selected one item");
			break;

		case 2:
			LOG.info("You have selected two item");
			break;

		default:
			LOG.info("You have not selected any item.");

		}

	}
}

/*
 * Class designed for requirement 2, add code wherever applicable as per
 * requirement given
 */
public class Snippet {

	private static final Logger LOG = Logger.getLogger("EShopAddToCart");

	public static void main(String[] args) {
		LOG.info("providing two as input");
		OrderDetails orderDetails1 = new OrderDetails("Watch", 2, 400);
		OrderDetails orderDetails2 = new OrderDetails("Book", 2, 400);
		orderDetails1.printMessage(orderDetails1.getQuantity());
		List<OrderDetails> list=new ArrayList<OrderDetails>();
		list.add(orderDetails1);
		list.add(orderDetails2);
		EShopAddToCart eShopAddToCart= new EShopAddToCart();
		eShopAddToCart.calculateSum(list);

	}
}
