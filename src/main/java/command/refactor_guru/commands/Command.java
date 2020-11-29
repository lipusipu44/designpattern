package command.refactor_guru.commands;

import command.refactor_guru.editor.Editor;

public abstract class Command {
    public Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup(){
        backup=editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(this.backup);
    }

    public abstract boolean execute();
}
