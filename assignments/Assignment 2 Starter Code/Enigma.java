public class Enigma implements Cipher{
        
    public Enigma(String key1, String key2){
    }

    @Override
    public char encode(char ch){       
        return ch;
    }

    @Override
    public char decode(char ch){          
        return ch;
    }
}
