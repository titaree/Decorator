
public class soy extends CondimentDecorator {

	Beverage beverage;
	 public soy (Beverage beverage){
		    this.beverage = beverage;
	    }
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription()+",soy";
	}
	public double cost(){
   	return 0.15 + beverage.cost();
}
}

