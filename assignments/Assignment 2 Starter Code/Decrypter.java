import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;


public class Decrypter{
    
    Cipher cipher = null;
    
    public Decrypter(Cipher cipher){
        this.cipher = cipher;
    }
    
    public void decrypt(String input){
        decrypt(input, null);
    }
    
    public void decrypt(String input, String outFile){
        File file = new File(input);
        BufferedReader br = null;
        boolean printToFile = false;
        
        PrintStream out = System.out;
        PrintStream fout = null;
        
        try{
            if (file.exists() && !file.isDirectory()){
                br = new BufferedReader(new FileReader(file));
            }
            else{
                br = new BufferedReader(new StringReader(input));
            }
            
            if (outFile != null){
                printToFile = true;
                fout = new PrintStream(outFile);
            }
            
            char ch;
            int c;
            // Read each char until EOL or EOF
            while((c = br.read()) != -1){
                // Encrypt it and print out
                ch = (char) c;
                ch = cipher.decode(ch);
                out.print(ch);
                if (printToFile){
                    fout.print(ch);
                }
            }
            if (br != null){
                br.close();
            }
            if (printToFile){
                fout.close();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        String path = "/home/ekenny/projects/Cipher/src/";
        Decrypter dec = new Decrypter(new Enigma("#GNUAHOVBIPWCJQXDKRYELSZFMT", "#EJOTYCHMRWAFKPUZDINSXBGLQV"));
        //Decrypter de = new Encrypter(new RotatingCipher("qwertyuiopasdfghjklzxcvbnm"));
        dec.decrypt(path + "inTest.txt.enc");
        //enc.encrypt("HELLO#WORLD
    }
}
