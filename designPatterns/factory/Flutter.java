package factory;

import factory.UI.IosUIFactory;
import factory.UI.UIFactory;
import factory.UI.WindowsUIFactory;

public class Flutter {
    //Non factory methods and attributes can be defined here
    void refreshUI() {
        System.out.println("Refreshing Flutter UI");
    }

    void setTheme(String theme) {
        System.out.println("Setting Flutter theme to: " + theme);
    }

    public UIFactory getUIFactory(Platform platform) {
        return UIFactoryFactory.getUIFactory(platform);
    }
}
