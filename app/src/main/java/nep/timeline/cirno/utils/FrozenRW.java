package nep.timeline.cirno.utils;
import nep.timeline.cirno.GlobalVars;


public class FrozenRW {
    public static final String cgroupV2 = "/sys/fs/cgroup";

    public static void frozen(int uid, int pid) {
        if(GlobalVars.FreezeMethod.equals(GlobalVars.v2_uid))
            RWUtils.writeCgroup(cgroupV2 + "/uid_" + uid + "/pid_" + pid + "/cgroup.freeze", 1);
        else
            RWUtils.writeCgroup(cgroupV2 + "/frozen"  + "/cgroup.procs", pid);
    }


    public static void thaw(int uid, int pid) {
        if(GlobalVars.FreezeMethod.equals(GlobalVars.v2_uid))
            RWUtils.writeCgroup(cgroupV2 + "/uid_" + uid + "/pid_" + pid + "/cgroup.freeze", 0);
        else
            RWUtils.writeCgroup(cgroupV2 + "/unfrozen"  + "/cgroup.procs", pid);
    }
}
