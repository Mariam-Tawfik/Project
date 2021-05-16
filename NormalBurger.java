
public class NormalBurger {
	//Map<String, Float> priceList = new HashMap<>();
	protected float totalPrice;

	public NormalBurger() {
		totalPrice = 10;
	}

	public void setMeatType(int type) {
		if (type == 1) {
			totalPrice += 10;
		} else if (type == 2) {
			totalPrice += 15;
		}
	}

	public void setRollBread(int type) {
		if (type == 1) {
			totalPrice += 10;
		} else if (type == 2) {
			totalPrice += 15;
		}
	}

	public void setAdditions(int num) {
		switch (num) {
			case 1:
				totalPrice += 5;
				break;
			case 2:
				totalPrice += 7;
				break;
			case 3:
				totalPrice += 9;
				break;
			case 4:
				totalPrice += 10;
				break;
		}
	}

	public float getPrice(){
		return totalPrice;
	}
}
