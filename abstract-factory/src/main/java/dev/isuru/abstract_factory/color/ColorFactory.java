package dev.isuru.abstract_factory.color;

import dev.isuru.abstract_factory.AbstractFactory;
import dev.isuru.abstract_factory.shape.Shape;

public class ColorFactory extends AbstractFactory {
	@Override
	public Shape getShape() {
		return null;
	}

	@Override
	public Color getColor() {
		return null;	
	}
}
