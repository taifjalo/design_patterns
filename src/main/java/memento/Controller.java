package memento;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> undoHistory; // undo history
    private List<IMemento> redoHistory; // redo history

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.undoHistory = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
        gui.updateGui();
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        model.setIsSelected(isSelected);

    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!undoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = undoHistory.remove(undoHistory.size() - 1);
            redoHistory.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();
        }
    }

    private void saveToHistory() {
        IMemento currentState = model.createMemento();
        undoHistory.add(currentState);
        redoHistory.clear();

    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            System.out.println("Memento found in history");
            IMemento previousState = redoHistory.remove(redoHistory.size() - 1);
            undoHistory.add(previousState);
            model.restoreState(previousState);
            gui.updateGui();

        }
    }

    public ObservableList<String> getHistory() {
        ObservableList<String> history = FXCollections.observableArrayList();
        for (IMemento memento : undoHistory) {
            history.add(memento.toString());
        }
        return history;


    }

    public void restoreState(int i) {
        IMemento previousState = undoHistory.get(i);
        model.restoreState(previousState);
        //undoHistory.remove(i);
    }
}