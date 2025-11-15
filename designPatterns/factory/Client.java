package factory;

import factory.UI.UIFactory;
import factory.components.button.Button;
import factory.components.menu.Menu;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        UIFactory uiFactory = flutter.getUIFactory(Platform.WINDOWS);

        Button button = uiFactory.createButton();
        button.render();

        Menu menu = uiFactory.createMenu();
        menu.display();
    }
}
