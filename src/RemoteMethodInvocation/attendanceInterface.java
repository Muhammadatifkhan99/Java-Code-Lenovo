package RemoteMethodInvocation;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface attendanceInterface extends Remote {
    public boolean markAttendance(int roll,String name) throws RemoteException;
}
