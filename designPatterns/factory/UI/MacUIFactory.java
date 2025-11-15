package factory.UI;

import factory.components.button.Button;
import factory.components.button.MacButton;
import factory.components.menu.MacMenu;
import factory.components.menu.Menu;

public class MacUIFactory implements UIFactory{


    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Menu createMenu() {
        return new MacMenu();
    }
}
