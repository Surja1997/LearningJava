package justForFun;


public class ModifyString {
    public static void main(String[] args) {
        myFunc("abcde");
    }

    static String myFunc(String input){
        String output = "";
        for (int i =0;i<input.length();i++){
            if (i%2==0)
                output+= String.valueOf(input.charAt(i)).toUpperCase();
            else
                output+= String.valueOf(input.charAt(i)).toLowerCase();

        }
        System.out.println(output);
        return output;
    }


}
