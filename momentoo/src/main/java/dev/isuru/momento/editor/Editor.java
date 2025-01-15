package dev.isuru.momento.editor;

public class Editor {
    private String content;

    public Editor() {
        this.content = "";
    }

    public void undo() {
        return;
    }

    public void redo() {
        return;
    }

    public void setContent(String content) {
        this.content += content;
    }

    public String getContent() {
        return content;
    }
}
