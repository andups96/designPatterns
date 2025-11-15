package factory.UI;

import factory.components.button.Button;
import factory.components.button.WindowsButton;
import factory.components.menu.Menu;
import factory.components.menu.WindowsMenu;

public class WindowsUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}
