package dev.isuru.momento.editor;

import java.util.Stack;

public class History {
    private final Stack<EditorState> states;

    public History() {
        this.states = new Stack<>();
    }

    public void push(EditorState state) {
        states.push(state);
    }

    public EditorState pop() {
        return states.pop();
    }
}
