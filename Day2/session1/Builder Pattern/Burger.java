package BuilderPattern;
public abstract class Burger implements Item {

	@Override
	public Packging packing() {
		return new Wrapper();
	}

	@Override
	public abstract float price();
	

}
