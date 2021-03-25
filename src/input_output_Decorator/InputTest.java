package input_output_Decorator;

import java.io.*;

public class InputTest {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            InputStream in=
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                            new FileInputStream("C:\\Users\\ssv41\\IdeaProjects\\pattern\\src\\input_output_Decorator\\test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char)c);
            }
            in.close();
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
