package RemoteMethodInvocation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AttendanceServer extends UnicastRemoteObject implements attendanceInterface {

    protected AttendanceServer() throws RemoteException {
        super();
    }

    public boolean markAttendance(int roll, String name) throws RemoteException {
        System.out.println("Attendance marked for: "+roll+" "+name);
        return true;
    }
}
