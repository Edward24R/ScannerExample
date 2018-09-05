 import java.awt.Color;
 import java.awt.Graphics;
 import java.awt.Graphics2D;
 import java.awt.Rectangle;
 import java.awt.geom.Ellipse2D;
 import java.awt.geom.Line2D;
 import javax.swing.JComponent;

 /**
 A component that draws an alien face.
 */
 public class InsideOfFrame extends JComponent{
   public void paintComponent(Graphics g){
	   
 // Recover Graphics2D
 Graphics2D g2 = (Graphics2D) g;

 // Draw the Circle
 Rectangle box = new Rectangle(500, 200, 400, 300); // (x, y, Width, height)
 g2.draw(box);

 // Draw the Color Boxes
 g2.setColor(Color.BLUE);
 Rectangle eye = new Rectangle(500, 300, 15, 15);
 g2.fill(eye);
 eye.translate(200, 0);
 g2.fill(eye);
 eye.translate(186, 0);
 g2.fill(eye);
 
 // Draw the line
 Line2D.Double line = new Line2D.Double(650, 200, 300, 300);
 g2.setColor(Color.RED);
 g2.draw(line);

 // Draw the greeting
 g2.setColor(Color.PINK);
 g2.drawString("Watch Real Anime Danny!", 700, 250);
 g2.setColor(Color.PINK);
 g2.drawString("Watch Real Anime Danny!", 700, 350);
 g2.setColor(Color.PINK);
 g2.drawString("Watch Real Anime Danny!", 700, 450);
 
 
 
    }
 }