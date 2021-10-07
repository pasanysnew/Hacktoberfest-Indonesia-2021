public class Reverse {
    String letter="";
    int size=0;
    String original ="";
    String reverse="";
    public void method()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word:");
        letter = input.nextLine();
        
        size = letter.length();
        
        /*
        for(int i=0; i<size; i++)
        {
            //System.out.println(letter.charAt(i));
            original = original+letter.charAt(i);
        }
        */
        for(int i=size-1; i>=0; i--)
        {
            //System.out.println(letter.charAt(i));
            reverse = reverse +letter.charAt(i);
        }
        
        
        //System.out.println(original);
        System.out.println("Reverse = "+reverse);
        
        
        if(letter.equals(reverse))
        {
            System.out.println("Pelindrome number");
        }
        else
        {
            System.out.println("Not a Pelindrome number");
        }
    }
    
}
