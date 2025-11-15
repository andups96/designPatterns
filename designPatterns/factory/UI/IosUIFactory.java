package factory.UI;

public class IosUIFactory implements UIFactory {
    @Override
    public factory.components.button.Button createButton() {
        return new factory.components.button.IosButton();
    }

    @Override
    public factory.components.menu.Menu createMenu() {
        return new factory.components.menu.IosMenu();
    }
}
