package dev.isuru.abstract_factory;

import dev.isuru.abstract_factory.color.ColorFactory;
import dev.isuru.abstract_factory.shape.ShapeFactory;

public class FactoryProducer {
	public AbstractFactory getFactory(FactoryType factoryType) {
		if (factoryType == FactoryType.Shape) {
			return new ShapeFactory();
		}
		if (factoryType == FactoryType.Color) {
			return new ColorFactory();
		}
		return null;
	}
}
