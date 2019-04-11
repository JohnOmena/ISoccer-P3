package resource;

public class TrainingCenterFactory implements ResourceFactory{

	@Override
	public Resource createResource() {
		return new TrainingCenter();
	}

}
