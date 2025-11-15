package factory.components.button;

public class IosButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering iOS Button");
    }
}
