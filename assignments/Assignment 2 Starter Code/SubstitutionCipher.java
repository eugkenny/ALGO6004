public class SubstitutionCipher implements Cipher{
	
	private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	protected SubstitutionCipher(){
		
	}
	
	public SubstitutionCipher(String key) {
	}

	public char encode(char ch) {
	    return ch;
	}

	public char decode(char ch) {
		return ch;
	}
}
