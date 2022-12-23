package RemoteMethodInvocation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RunService {
    public static void main(String[] args) throws Exception{
        AttendanceServer s = new AttendanceServer();

        Registry reg = LocateRegistry.createRegistry(5565);
        reg.bind("attendance",s);
    }
}
