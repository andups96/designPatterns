package factory.UI;

import factory.components.button.AndroidButton;
import factory.components.button.Button;
import factory.components.button.WindowsButton;
import factory.components.menu.AndroidMenu;
import factory.components.menu.Menu;

public class AndroidUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Menu createMenu() {
        return new AndroidMenu();
    }
}
