package 강의3;

public class PracItem {

	private String name;
	private int price;
	private int barcodeNum;
	private int Mileage;
	
	public PracItem(int barcodeNum,String name,int price)
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
        if (this instanceof PracTv) {
            return (int)(price * 0.03);
        } else {
            return (int)(price * 0.01);
        }
    }
}
