import javax.swing.JFrame;

public class SnakeIOFrame extends JFrame {

  SnakeIOFrame(){
    this.add(new SnakeIOScreen());
    this.setTitle("SnakeIO");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.pack();
    this.setVisible(true);
    this.setLocationRelativeTo(null);
  }
}
