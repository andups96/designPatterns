package factory.UI;

import factory.components.button.Button;
import factory.components.menu.Menu;

public interface UIFactory {
    //Factory Methods
    Button createButton();
    Menu createMenu();

}
