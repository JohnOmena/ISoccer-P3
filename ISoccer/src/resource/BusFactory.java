package resource;

public class BusFactory implements ResourceFactory{

	@Override
	public Resource createResource() {
		return new Bus();
	}

}
