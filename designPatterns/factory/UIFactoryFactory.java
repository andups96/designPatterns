package factory;

import factory.UI.*;

public class UIFactoryFactory {
    //Factory method to get object of corresponding UIFactory
    public static UIFactory getUIFactory(Platform platform) {
        if (platform == null) {
            return null;
        }
        if (platform.equals(Platform.ANDROID)) {
            return new AndroidUIFactory();
        } else if (platform.equals(Platform.IOS)) {
            return new IosUIFactory();
        } else if (platform.equals(Platform.MAC)) {
            return new MacUIFactory();
        } else if (platform.equals(Platform.WINDOWS)) {
            return new WindowsUIFactory();
        }
        return null;
    }
}
