class Car
{
	 private double regularPrice;
	 public Car( double regularPrice) 
	 {
	        this.regularPrice = regularPrice;
	 }
	 public double getSalePrice() 
	 {
	        return regularPrice;
	 }
}
class Sedan extends Car 
{
    private int length;

    public Sedan( double regularPrice, int length) {
        super(regularPrice);
        this.length = length;
    }

    public double getSalePrice() 
    {
        return super.getSalePrice() * (length < 20 ? 0.9 : 0.95);
    }
}

class CarDiscountExample
{
    public static void main(String[] args) 
    {
        Sedan obj = new Sedan(500000, 30);
	Sedan obj1 = new Sedan(500000, 15);
        System.out.println("5% Discount Price on Original Price 500000Rs : "+obj.getSalePrice()+" Rs");
	System.out.println("10% Discount Price on Original Price 500000Rs : "+obj1.getSalePrice()+" Rs");      
    }
}