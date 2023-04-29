package 강의3;

public class Bicycle extends Item{

	private String brand;

    public Bicycle(int price, String name, int barcodeNum) {
        super(name, price, barcodeNum);
       
    }

    public String getBrand() {
        return brand;
    }


	
}
