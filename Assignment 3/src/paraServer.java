/**
 * Created by Adam oManley Kelly - R00113196 on 17/11/2016.
 * https://github.com/adammanley-kelly/Assignment3-AOP-2016
 */
import java.rmi.*;
import java.rmi.server.*;


public class paraServer extends UnicastRemoteObject implements para
{

    private String name1,b;
    int [] arr1 = new int[4];

    private int age ;
    paraObject a;

    public paraServer() throws RemoteException
    {
        name1 = "adam";
        age = 21;
        for (int i = 0; i < 4; i++) {
            arr1[i] = i;
        }
    }

    public String getPara() throws RemoteException
    {
        String details;

        details = name1 + (Integer.toString(age));

        return details;
    }

    public String getParaObject() throws RemoteException
    {
        a = new paraObject("The Breakfast Club",1985);
        b = a.print();
        return b;
    }
    @Override
    public int[] getparaArray() throws RemoteException {
        return arr1;
    }

    public static void main (String args[])
    {

        try {
            paraServer server = new paraServer();
            Naming.rebind("Para", server);
            System.out.println("Server Started");

        }
		/* If the URL-formatted name is not legal... */
        catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL for name " + e.toString());
        }

		/* If any communication failures occur... */
        catch (RemoteException e) {
            System.out.println("Communication error " + e.toString());
        }
    }
}
