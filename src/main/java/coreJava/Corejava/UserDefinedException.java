package coreJava.Corejava;

class UserDefExcp extends Exception
{
    public UserDefExcp(String message) {
        super(message);
    }
}
public class UserDefinedException {
    public static void main(String[] args) {
        int i,j;
        i=8;j=9;
        try {
            int k=i/j;
            if (k==0)
            {
                throw new UserDefExcp("This is not possible");
            }
            System.out.println(k);

        }
        catch (Exception e)
        {
            System.out.println("Error "+e.getMessage());
        }

    }
}
