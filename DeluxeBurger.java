public class DeluxeBurger extends NormalBurger {
    private String name = "Deluxe Burger";
    public String getName(){
        return name;
    }

    private String meatType;
    public void setMeatType(){
        meatType = "beef";
    }
    private String rollBreadType;
    public  void setRollBreadType(){
        rollBreadType = "white";
    }

    private String add_1, add_2;
    public void getAdditions(){
        add_1 = "chips";
        add_2 = "drink";
    }
    @Override
    public float getPrice(){
		return (float) 60.00;
	}
}
