package 강의3;

import java.util.List;
import java.util.ArrayList;

public class ShoppingBasket {
	
	private List<Item> itemList;

    public ShoppingBasket() {
    	itemList = new ArrayList<Item>();
    }
    
    public List<Item> getItemList() {
		return itemList;
	}


    public void addItem(Item item) {
    	if(item instanceof Bicycle)
    		return;
    	
        getItemList().add(item);
    }

    public void removeItem(Item item) {
        getItemList().remove(item);
    }

    public String getInfoList() {
        String infoList = "";
        for (Item item : getItemList()) {
            infoList += "물품명 : " + item.getName() + " : " + item.getPrice() + System.lineSeparator();
        }
        return infoList;
    }

	

	public int getTotalPrice() {
        int totalPrice = 0;
        for (Item item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    
	}
	
	 public int getTotalMileage() {
	        int totalMileage = 0;
	        for (Item item : itemList) {
	            totalMileage += item.Mileage();
	        }
	        return totalMileage;
	    }

	
	
}


