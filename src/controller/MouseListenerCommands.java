package controller;
import controller.commands.*;
import model.interfaces.ICommand;
import model.persistence.ApplicationState;
import view.interfaces.PaintCanvasBase;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;


public class MouseListenerCommands extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        ICommand command;
        String button = ((JButton) e.getSource()).getText();

        if (button.equalsIgnoreCase("UNDO")) {
            command = new UndoCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (button.equalsIgnoreCase("REDO")) {
            command = new RedoCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (button.equalsIgnoreCase("COPY")) {
            command = new CopyCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        } else if (button.equalsIgnoreCase("PASTE")) {
            command = new PasteCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }else if (button.equalsIgnoreCase("DELETE")) {
            command = new DeleteCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (button.equalsIgnoreCase("GROUP")) {
            command = new GroupCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }
        else if (button.equalsIgnoreCase("UNGROUP")) {
            command = new UngroupCommand();
            try {
                command.run();
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

    }
}




