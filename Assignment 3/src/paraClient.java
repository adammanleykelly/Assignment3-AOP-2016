/**
 * Created by Adam Manley Kelly - R00113196 on 17/11/2016.
 * https://github.com/adammanley-kelly/Assignment3-AOP-2016
 */
import java.rmi.*;
import java.lang.*;
import java.util.Arrays;

public class paraClient
{
    public static void main (String args[])
    {
        para serverObject;
        Remote RemoteObject;

        try
        {
            String name = "rmi://localhost/Para";
            RemoteObject = Naming.lookup(name);

            serverObject = (para)RemoteObject;

                System.out.println(serverObject.getPara() + "\n");
                System.out.println(Arrays.toString(serverObject.getparaArray()) +"\n");
                System.out.println(serverObject.getParaObject());
        }
        catch (Exception e) {
            System.out.println("Error in invoking object method " +
                    e.toString() + e.getMessage());
            e.printStackTrace();
        }
    }
}

