import javax.swing.*;

public class testComponents extends JFrame {
    public testComponents(){
        setTitle("Custom Component Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);

        CustomComponent customComponent = new CustomComponent();
        add(customComponent);

        setVisible(true);
    }
}
