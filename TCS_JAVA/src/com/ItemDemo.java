package com;

public class ItemDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item[] itemObj = new Item[5];
		itemObj[0] = new Item(101,"A",10,1);
		itemObj[1] = new Item(102,"B",100,5);
		itemObj[2] = new Item(103,"C",10,2);
		itemObj[3] = new Item(104,"D",150,20);
		itemObj[4] = new Item(105,"E",110,10);
		System.out.println(getLeastPriceItem(itemObj).getItemId());;
	}
	
	public static Item getLeastPriceItem(Item[] itOb)
	{
		Item minObj = itOb[0];
		for(int i=1; i<itOb.length;i++)
			if((itOb[i].getItemPrice()-itOb[i].getItemDiscount())<(minObj.getItemPrice ()-minObj.getItemDiscount()))
				minObj=itOb[i];
		return minObj;
		}

}
