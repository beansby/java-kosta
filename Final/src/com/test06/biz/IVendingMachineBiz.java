package com.test06.biz;

import com.test06.entity.Drink;

public interface IVendingMachineBiz {
	void cartDrink(Drink drink) throws Exception;
	
	void printCart();
	
	void prinkDrinkList(Drink[] drinkList);

}
