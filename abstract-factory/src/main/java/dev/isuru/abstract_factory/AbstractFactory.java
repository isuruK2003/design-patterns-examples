package dev.isuru.abstract_factory;

import dev.isuru.abstract_factory.color.Color;
import dev.isuru.abstract_factory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape();
	public abstract Color getColor();
}
