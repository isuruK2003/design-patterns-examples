package dev.isuru.abstract_factory.shape;

import dev.isuru.abstract_factory.AbstractFactory;
import dev.isuru.abstract_factory.color.Color;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape() {
        return null;
    }

	@Override
	public Color getColor() {
		return null;
	}
}
