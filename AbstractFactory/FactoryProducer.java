public class FactoryProducer {
	public AbstractFactory getFactory(FactoryType type) {
		if (factoryType == FactoryType.Shape) {
			return new ShapeFactory();
		}
		
		if (factoryType == FactoryType.Color) {
			return new ColorFactory();
		}
		return null;
	}
}
