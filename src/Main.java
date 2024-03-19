public class Main {
    UI ui = new UI();

    public static void main(String[] args) {
        // Initialize FlatLaf
        FlatLaf.initialize();

        // Create UI
        new Main();
    }

    public Main() {
        ui.createUI();
    }
}
