qimport javax.swing.*;

public class WorldLottery {

	public static void main(String args[]){
	JFrame frame = new JFrame("Test");
	frame.setVisible(true);
	frame.setSize(200,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



	JLabel label = new JLabel("hello");
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(label);


	JButton button = new JButton("hello again");

	panel.add(button);


}

}



