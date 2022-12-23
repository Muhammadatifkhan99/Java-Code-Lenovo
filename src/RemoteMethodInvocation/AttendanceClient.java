package RemoteMethodInvocation;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class AttendanceClient {
    public static void main(String[] args) throws Exception{
        Registry reg = LocateRegistry.getRegistry("127.0.0.1",5565);
        attendanceInterface a = (attendanceInterface)reg.lookup("attendance");

        a.markAttendance(2,"Atif");
    }
}
