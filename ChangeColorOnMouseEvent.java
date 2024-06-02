import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ChangeColorOnMouseEvent extends Applet implements MouseListener {
    Color[] colors = {Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW};
    int colorIndex = 0;

    public void init() {
        setBackground(Color.WHITE);
        addMouseListener(this);
    }

    public void mouseClicked(MouseEvent e) {
        // Change background color on mouse click
        colorIndex = (colorIndex + 1) % colors.length;
        setBackground(colors[colorIndex]);
    }

    public void mouseEntered(MouseEvent e) {
        // Change background color when mouse enters the applet area
        setBackground(colors[colorIndex]);
    }

    public void mouseExited(MouseEvent e) {
        // Restore original background color when mouse exits the applet area
        setBackground(Color.WHITE);
    }

    public void mousePressed(MouseEvent e) {
        // Not used in this example
    }

    public void mouseReleased(MouseEvent e) {
        // Not used in this example
    }
}