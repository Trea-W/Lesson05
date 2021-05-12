import javax.swing.*;

public class WorldLottery {

	public static void main(String args[]){
	JFrame frame = new JFrame("Test");
	frame.setVisible(true);
	frame.setSize(200,200);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	JLabel labelTwo = new JLabel("hello again");
	JPanel panelTwo = new JPanel();
	JLabel label = new JLabel("hello");
	JPanel panel = new JPanel();
	frame.add(panel);
	panel.add(label);

	frame.add(panelTwo);
	panelTwo.add(labelTwo);



	JButton button = new JButton("hello again");

	panel.add(button);
	//adding some little comment
	//The comment that is asociatted with branchingoffbranch


}

}



