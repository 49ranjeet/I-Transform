package Eshop;

import java.util.List;
import java.util.logging.Logger;

/* Class designed for requirement 1, add code wherever applicable as per requirement given */
class EShopAddToCart {
	private static final Logger LOG = Logger.getLogger("OrderDetails");

	int totalAmountOfItems = 0;
	int totalDiscountOfItems=0;

	public void calculateSum(List<OrderDetails> orderDetails) {

		for (OrderDetails orderDetails2 : orderDetails) {

			totalAmountOfItems = totalAmountOfItems + (int) (orderDetails2.getItemCost() * orderDetails2.getQuantity());

		}
		LOG.info("Total Purchase Amount is " + totalAmountOfItems);
		
		calculateDiscount(totalAmountOfItems);

	}

	public void calculateDiscount(int totalAmountOfItems) {
		if (totalAmountOfItems < 1000) {
			totalDiscountOfItems =(totalAmountOfItems*10)/100;

		}
		if (1000 < totalAmountOfItems &&  totalAmountOfItems < 10000) {
			totalDiscountOfItems =(totalAmountOfItems*20)/100;

		}
		if (totalAmountOfItems > 10000) {
			totalDiscountOfItems =(totalAmountOfItems*30)/100;

		}
		LOG.info("Total Discount Amount is " + totalDiscountOfItems);

	}

}
