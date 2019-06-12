
javax.swing.JFrame;

public class FrameDemo{
	public static void main(String[] args){
		JFrame frame = new JFrame("Frame Demo");  // creates the title of demo
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // makes the frame
		frame.setSize(400, 400); // frame size 400x400

		frame.setVisible(true); // inside of frame is visible
	}
}
k
