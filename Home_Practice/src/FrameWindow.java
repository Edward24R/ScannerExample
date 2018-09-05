
import javax.swing.JFrame;

public class FrameWindow {
 public static void main(String[] args)
 {
 JFrame frame = new JFrame();
 frame.setSize(800, 800);
 frame.setTitle("Experiment Box");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

 InsideOfFrame component = new InsideOfFrame();
 frame.add(component);

 frame.setVisible(true);
     }
 }
