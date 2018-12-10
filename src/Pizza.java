import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;


public class Pizza extends JFrame implements ActionListener{
	
	JLabel title, toppings, size, type;
	JCheckBox tomato, greenPepper, blackOlives;
	JRadioButton small, medium, large;
	JRadioButton thinCrust, mediumCrust, pan;
	ButtonGroup bgSize, bgType;
	JLabel yourToppings, yourSize, yourType;
	String msgToppings = "Your Toppings: ", msgSize = "Pizza Size: ", msgType = "Pizza Type: ";
	
	Pizza() {
		super("Pizza");
		
		title = new JLabel("Welcome to the Pizza Store :)");
		title.setBounds(50, 10, 300, 20);
		toppings = new JLabel("Toppings");
		toppings.setBounds(50, 40, 100, 20);
		size = new JLabel("Pizza size");
		size.setBounds(200, 40, 100, 20);
		type = new JLabel("Pizza type");
		type.setBounds(370, 40, 100, 20);
		
		tomato = new JCheckBox("Tomato");
		tomato.setBounds(30, 60, 150, 20);
		tomato.addActionListener(this);
		greenPepper = new JCheckBox("Green Pepper");
		greenPepper.setBounds(30, 80, 150, 20);
		greenPepper.addActionListener(this);
		blackOlives = new JCheckBox("Black Olives");
		blackOlives.setBounds(30, 100, 150, 20);
		blackOlives.addActionListener(this);
		
		small = new JRadioButton("Small");
		small.setBounds(180, 60, 150, 20);
		small.addActionListener(this);
		medium = new JRadioButton("Medium");
		medium.setBounds(180, 80, 150, 20);
		medium.addActionListener(this);
		large = new JRadioButton("Large");
		large.setBounds(180, 100, 150, 20);
		large.addActionListener(this);
		
		thinCrust = new JRadioButton("Thin Crust");
		thinCrust.setBounds(350, 60, 150, 20);
		thinCrust.addActionListener(this);
		mediumCrust = new JRadioButton("Medium Crust");
		mediumCrust.setBounds(350, 80, 150, 20);
		mediumCrust.addActionListener(this);
		pan = new JRadioButton("Pan");
		pan.setBounds(350, 100, 150, 20);
		pan.addActionListener(this);
		
		bgSize = new ButtonGroup();
		bgSize.add(small);
		bgSize.add(medium);
		bgSize.add(large);
		
		bgType = new ButtonGroup();
		bgType.add(thinCrust);
		bgType.add(mediumCrust);
		bgType.add(pan);
		
		yourToppings = new JLabel(msgToppings);
		yourToppings.setBounds(25, 140, 400, 20);
		yourSize = new JLabel(msgSize);
		yourSize.setBounds(50, 160, 150, 20);
		yourType = new JLabel(msgType);
		yourType.setBounds(50, 180, 200, 20);
		
		add(title);
		add(toppings);
		add(size);
		add(type);
		
		add(tomato);
		add(greenPepper);
		add(blackOlives);
		
		add(small);
		add(medium);
		add(large);
		
		add(thinCrust);
		add(mediumCrust);
		add(pan);
		
		add(yourToppings);
		add(yourSize);
		add(yourType);
		
		setSize(500,300);
		setLayout(null);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		msgToppings = "Your Toppings: ";
		if(tomato.isSelected())
			msgToppings += "Tomato  ";
		if(greenPepper.isSelected())
			msgToppings += "Green Pepper  ";
		if(blackOlives.isSelected())
			msgToppings += "Black Olives  ";
		
		msgSize = "Pizza Size: ";
		if(small.isSelected())
			msgSize += "Small";
		if(medium.isSelected())
			msgSize += "Medium";
		if(large.isSelected())
			msgSize += "Large";
		
		msgType = "Pizza Type: ";
		if(thinCrust.isSelected())
			msgType += "Thin Crust";
		if(mediumCrust.isSelected())
			msgType += "Medium Crust";
		if(pan.isSelected())
			msgType += "Pan";
		
		yourToppings.setText(msgToppings);
		yourSize.setText(msgSize);
		yourType.setText(msgType);
		
		getContentPane().validate();
		getContentPane().repaint();
		
	}
	
	public static void main(String[] args) {
		new Pizza();
	}

}
