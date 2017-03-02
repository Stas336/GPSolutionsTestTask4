package main;

import java.io.*;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            BufferedReader input = new BufferedReader(new FileReader("input.txt"));
            input.readLine();
            String[] buff = input.readLine().split(" ");
            input.close();
            int amountOf3 = 0, amountOf4 = 0;
            String evenNumbers = "", oddNumbers = "";
            for (String str:buff)
            {
                if (Integer.parseInt(str) % 2 != 0)
                {
                    oddNumbers = addStringToString(str, oddNumbers);
                    amountOf3++;
                }
                else
                {
                    evenNumbers = addStringToString(str, evenNumbers);
                    amountOf4++;
                }
            }
            BufferedWriter output = new BufferedWriter(new FileWriter("output.txt"));
            output.write(oddNumbers);
            output.newLine();
            output.write(evenNumbers);
            output.newLine();
            if (amountOf3 < amountOf4)
            {
                output.write("YES");
            }
            else
            {
                output.write("NO");
            }
            output.close();
        }catch (IOException ex)
        {
            System.out.println(ex.getMessage());
        }
    }

    private static String addStringToString(String str, String origStr)
    {
        if (origStr.isEmpty())
        {
            return str;
        }
        else
        {
            return origStr + " " + str;
        }
    }
}
