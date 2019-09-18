import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		
		String y=JOptionPane.showInputDialog("what is ur star sign");
		
		
		if(y.equals("Aries")) {
			JOptionPane.showMessageDialog(null," Courageous, energetic, willful,\n commanding, leading.\n Often leads when following\n would be best course of action.");
		}
		if(y.equals("Taurus")) {
			JOptionPane.showMessageDialog(null, "Pleasure seeking, loves control, dependable,\n grounded, provokes slowly, and highly\n sensual in nature.");
		}
		if(y.equals("Gemini")) {
			JOptionPane.showMessageDialog(null, "Cerebral, chatty,\n loves learning and education,\n charming, and adventurous.");
		}
		if(y.equals("Cancer")) {
			JOptionPane.showMessageDialog(null, "A water sign; ruled by the Moon.\n" + 
					"Emotional, group oriented,/n seeks security, family.");
		}
		if(y.equals("Leo")) {
			JOptionPane.showMessageDialog(null, "Fire sign; ruled by the Sun.\n" + 
					"Generous, organized, protective, beautiful.");
		}
		if(y.equals("Virgo")) {
			JOptionPane.showMessageDialog(null, "Earth sign; ruled by Mercury.\n" + 
					"Particular, logical, practical,/n sense of duty, critical.");
		}
		
		if(y.equals("Libra")) {
			JOptionPane.showMessageDialog(null, "Air sign; ruled by Venus.\n" + 
					"Balanced, seeks beauty, sense of justice.");
		}
		if(y.equals("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Water sign; ruled by Pluto\n" + 
					"Passionate, exacting, loves extremes,\n combative, reflective.");
			
			if(y.equals("Sagittarius")) {
				JOptionPane.showMessageDialog(null, "Fire sign; ruled by Jupiter.\n" + 
						"Happy, absent minded, creative,\n adventurous.");
				
			if(y.equals("Capricrn"))	{
				JOptionPane.showMessageDialog(null, "Earth sign; ruled by Saturn.\n" + 
						"Timeless, driven, calculating,/n ambitious.");
			}
			
			if(y.equals("Aquarius")) {
				JOptionPane.showMessageDialog(null, "Air sign; ruled by Uranus.\n" + 
						"Forward thinking, communicative, people\n oriented, stubborn, \ngenerous, and dedicated.");
			}
				
				
				
				
				
				
				
				
				
			}
			
			
		}
		
		
		
		
		
	}

}
