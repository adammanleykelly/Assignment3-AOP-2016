/**
 * Created by Adam Manley Kelly - R00113196 on 17/11/2016.
 * https://github.com/adammanley-kelly/Assignment3-AOP-2016
 */

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface para extends Remote
{

    String getPara()
            throws RemoteException;
    int[] getparaArray()
        throws RemoteException;
    String getParaObject()
        throws RemoteException;

}

