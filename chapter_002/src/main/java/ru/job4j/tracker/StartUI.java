package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Пользовательский интерфейс программы Tracker
 */
public class StartUI {
    public void init(Input input, Tracker tracker, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ", actions.size());
            UserAction action = actions.get(select);
            run = action.execute(input, tracker);
        }
    }

    /**
     * Масссив действий юзера
     * @param actions - Действие Юзера
     */
    private void showMenu(List<UserAction> actions) {
        System.out.println("Menu.");
        for (int index = 0; index < actions.size(); index++) {
            System.out.println(index + ". " + actions.get(index).name());
        }
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Input validate = new ValidateInput(input);
        Tracker tracker = new Tracker();
        List<UserAction> actions = new ArrayList<>(Arrays.asList(
                new CreateAction(),
                new FindAllAction(),
                new DeleteAction(),
                new EditAction(),
                new FindByNameAction(),
                new FindByIdAction(),
                new ExitAction()
        ));
        new StartUI().init(validate, tracker, actions);
    }
}