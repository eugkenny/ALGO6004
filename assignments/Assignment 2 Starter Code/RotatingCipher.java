public class RotatingCipher extends SubstitutionCipher implements Cipher{

	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
	
	public RotatingCipher(String key){
	}
	
	public char encode(char ch) {		
	    return ch;
	}

	public char decode(char ch) {	
	    return ch;
	}

	private void rotate(){
	}
}
