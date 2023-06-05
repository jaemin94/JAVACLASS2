package 강의3;

import java.util.*;

public class PracShoppingBasket {

	private List<PracItem> itemList;

    public PracShoppingBasket() {
    	itemList = new ArrayList<PracItem>();
    }
    
    public List<PracItem> getItemList() {
		return itemList;
	}


    public void addItem(PracItem item) {
    	if(item instanceof PracBicycle)
    		return;
    	
        getItemList().add(item);
    }

    public void removeItem(PracItem item) {
        getItemList().remove(item);
    }

    public String getInfoList() {
        String infoList = "";
        for (PracItem item : getItemList()) {
            infoList += "물품명 : " + item.getName() + " : " + item.getPrice() + System.lineSeparator();
        }
        return infoList;
    }

	

	public int getTotalPrice() {
        int totalPrice = 0;
        for (PracItem item : itemList) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    
	}
	
	 public int getTotalMileage() {
	        int totalMileage = 0;
	        for (PracItem item : itemList) {
	            totalMileage += item.Mileage();
	        }
	        return totalMileage;
	    }
}
