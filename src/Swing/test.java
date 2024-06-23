import java.awt.*;
import java.applet.Applet;
// <applet code="PieChart.java" height="300" width="300"></applet>
public class PieChart extends Applet {

	public void paint(Graphics g) {
		
		// variables to store the number of students in each discipline
		// and the total number of students
		int Sci, Soc, Hum, Total;
		
		// variables to store percentages should be float
		float PercSci, PercSoc, PercHum;
		
		// the coordinates and size of the pie is fixed below
		int x = 50, y = 50, w = 200, h = 200;
		
		// these quantities will need to be computed for each slice
		int startAngle = 0, degrees;
		
		// Set # of students in each discipline
		Sci = 5;
		Soc = 6;
		Hum = 7;
		
		// Computer percentages
		Total = Sci + Soc + Hum;
		
		PercSci = Sci * 100.0f / Total;
		PercSoc = Soc * 100.0f / Total;
		PercHum = Hum * 100.0f / Total;
	
		// Print out results for checking
		System.out.println("Total = " + Total);
		System.out.println("%Sci = " + PercSci);
		System.out.println("%Soc = " + PercSoc);
		System.out.println("%Hum = " + PercHum);
		
		// Display the Pie Chart
		// Display the Pie for Sciences
		degrees = (int) (PercSci*360/100);
		g.setColor(Color.red);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
		// Pie for Soc
		startAngle = degrees;
		degrees = (int) (PercSoc*360/100);
		g.setColor(Color.yellow);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
		// Pie for Hum
		startAngle = startAngle + degrees;
		degrees = (int) (PercHum*360/100);
		g.setColor(Color.green);
		g.fillArc(x, y, w, h, startAngle, degrees);
		
	} // end of paint
} // end of applet