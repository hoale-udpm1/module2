import java.util.Scanner;

public class CountCharacter {
    static int i,j,k,c=0,w;

    static char m;

    public static void main(String[] args) {
        System.out.println("Input string is : ");
        System.out.println("Xin chao minh ten Hoa");
        System.out.println("");
        System.out.println("");
        System.out.println("Output :");
        frequencycount("Xin chao minh ten Hoa");
    }


    static void frequencycount(String s)

    {

        char[] z=new char[s.length()];
        for(w=0;w<s.length();w++)
            z[w]=s.charAt(w);
        for(i=0;i<w;i++)
        {
            char ch=z[i];
            for(j=i+1;j<w;j++)
            {
                if(z[j]==ch)
                {
                    for(k=j;k<(w-1);k++)
                        z[k]=z[k+1];
                    w--;
                    j=i;
                }
            }
        }

        int[] t=new int[w];
        for(i=0;i<w;i++)
        {
            for(j=0,c=0;j<s.length();j++)
            {
                if(z[i]==s.charAt(j))
                    c++;
            }
            t[i]=c ;
            System.out.print(z[i]+"="+c+",");
        }
    }
}
