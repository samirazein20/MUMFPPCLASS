package lesson1;

public class DrumkitTestDrive {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Drumkit d = new Drumkit();
		
		d.playSnare();
		d.playTopHat();
		d.snare = false;
		
		if(d.snare == true) {
			d.playSnare();
		}

	}

}
