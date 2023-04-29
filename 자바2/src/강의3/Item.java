package 강의3;

public abstract class Item {
	
	private String name;
	private int price;
	private int barcodeNum;
	private int Mileage;
	
	public Item(String name,int barcodeNum,int price)
	{
		this.name = name;
		this.barcodeNum = barcodeNum;
		this.price = price;
		
	}
	

	
	public int getbarcodeNum() {
        return barcodeNum;
    }
	
	public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getMileageRate() {
        return Mileage;
    }
    
    public int Mileage() {
        if (this instanceof Tv) {
            return (int)(price * 0.03);
        } else {
            return (int)(price * 0.01);
        }
    }

    /*
     public Item(int barcodeNum, String name, int price)
     {
     	this.barcodeNum = barcodeNum;
     	this.name = name;
     	this.price = price;
     	this.Mileage = 1;
     }
     
     public Item(int barcodeNum, String name, int price, int Mileage)
     {
     	this(barcodeNum,name,price);
     	this.Mileage = Mileage;
     }
     */
    
}
	


