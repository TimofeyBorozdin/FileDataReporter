import java.io.FileReader;

public class Reporter
{
    public static void main(String[] args) throws Exception{
        int i = 0;
        int nOfLines = 0;
        int nOfWords = 0;
        
        System.out.println("The contents of the file are:");
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        //initialisation
        FileReader in = new FileReader("file.txt");
        //reading the first char
        int t = in.read();
        //while not ent of time
        while (t != -1){
            if(t == 13){
                //condition to skip a line
                System.out.println();
                // read the extra unnecessary character 10
                t = in.read();
                nOfLines++;
                nOfWords++;
            }
            else{
                //output inline character
                System.out.print((char)t);
                if(t == 32){
                    nOfWords++;
                }
            }
            //read again (looped)
            t = in.read();
            i++; //times of loop's actions
        }
        if(i != 0){
            nOfWords++; //if document has at least 1 character it contains 1 word
            nOfLines++; //if document has at least 1 character it contains 1 line
        }
        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("----------------------------------------");
        //outputing stats
        System.out.println();
        System.out.println("number of words in the document" + nOfWords);
        System.out.println("number of lines in the document" + nOfLines);
    }
}
