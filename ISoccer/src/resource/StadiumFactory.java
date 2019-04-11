package resource;

public class StadiumFactory implements ResourceFactory{

	@Override
	public Resource createResource() {
		return new Stadium();
	}

}
