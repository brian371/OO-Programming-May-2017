package java8stuff;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.JButton;
import javax.swing.event.HyperlinkEvent.EventType;

public class UsingLambdas {

	public static void main(String[] args) {
		List<String> ssnList = Arrays.asList(
				new String[]
				{"411-44-5555", "777-88-5555",
			    "444-88-7777", "444-88-8888"});

		 
		ssnMask (String ssn) -> {
			String masked = "xxx-xx-" + ssn.substring(7);
			System.out.println(masked);
			
		};
		ssnList.forEach();
		
		// This is a button in Java Swing, which is used for
		// desktop applications.
		JButton button = new JButton("Ok");
		// event handling using Java 8
		button.addActionListener( 
		(e) -> System.out.println("button clicked"));
		
		// event handling in Java 7
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Button clicked.");
			}
		});
		
	}

}
