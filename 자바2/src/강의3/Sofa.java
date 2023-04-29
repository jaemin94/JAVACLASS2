package 강의3;

public class Sofa extends Item{

	private String color;

    public Sofa(int price, String name, int barcodeNum) {
    	super(name, price, barcodeNum);
        
    }

    public String getColor() {
        return color;
    }

   
}
