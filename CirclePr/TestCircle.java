
import javax.swing.JOptionPane;

public class TestCircle {
    public static void main(String[] args) {

        // Handle exceptions
        try {
            // Accept input from the user using the input dialog
            int radius = Integer.parseInt(JOptionPane.showInputDialog("Enter the radius of the circle"));
            int height = Integer.parseInt(JOptionPane.showInputDialog("Enter the height of the circle"));

            Cone ConeTop = new Cone(radius, height);

            // Display the radius, height, area, volume, and cost of the cone in the figure
            String output = String.format("Radius: %d\nHeight: %d\nArea: %5.2f\nVolume: %5.6f\nCost: GHC %5.2f", radius,
                    height, ConeTop.area(), ConeTop.volume(), ConeTop.cost());

            // below using JOPTION. (show message dialog with the String 'output' as the
            // message for the dialog)
            JOptionPane.showMessageDialog(null, output, "Results", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            // Print out a message to show that an error occurred
            System.out.println("Enter a valid input");
        }
    }
}
