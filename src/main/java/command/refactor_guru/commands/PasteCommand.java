package command.refactor_guru.commands;

import command.refactor_guru.editor.Editor;

public class PasteCommand extends Command{

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        return false;
    }
}
