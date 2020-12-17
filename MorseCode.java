import java.util.*;
public class MorseCode
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        String input;
        

        System.out.println("What do you want the translation for?");
        input = in.nextLine();
        //decodes the user input from morsecode to string
        decode(input, "");
    }
    public static void decode(String input, String word)
    {
        // checks the length of the user input and ends the recusive call if it's 0
        if(input.length() == 0)
        {
            System.out.println(word);
        }

        String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
        "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
        "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
        "9", "0"};

        String[] morseCodes = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
        "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
        "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
        "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
        "-....", "--...", "---..", "----.", "-----"};
        
        // initializes i to the length of the input
        for(int i = 1; i <= input.length(); i++)
        {
            // slices the input into sections to be handled individually
            String cut = input.substring(0, i);
            for(int j = 0; j < morseCodes.length; j++)
            {
                if(cut.equals(morseCodes[j]))
                {
                    decode(input.substring(i), word + alphabet[j]);
                }
            }
        }
    }
}