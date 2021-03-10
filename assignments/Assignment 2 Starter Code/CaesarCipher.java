/**
 *  Class that encodes and decodes individual characters using the "Caesar cipher".
 *   
 */
public class CaesarCipher implements Cipher{
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private static final String SHIFTED = "defghijklmnopqrstuvwxyzabc";
    

    /**
     *  Constructs a Cipher object.
     */
    public CaesarCipher(){
    }

    /**
     * Encodes a single character.
     *   @param ch the character to be encoded
     *   @return the character three later in the alphabet, with wrap-around
     */
	public char encode(char ch) {					
	    int index = ALPHABET.indexOf(ch);
	    return ch = SHIFTED.charAt(index);
	}
	
    /**
     * Decodes a single character.
     *   @param ch the character to be decoded
     *   @return the character three earlier in the alphabet, with wrap-around
     */
    public char decode(char ch) {
        int index  = SHIFTED.indexOf(ch);
        return ch = ALPHABET.charAt(index);
	}
}