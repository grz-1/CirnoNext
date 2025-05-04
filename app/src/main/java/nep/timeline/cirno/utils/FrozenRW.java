package nep.timeline.cirno.utils;
import static nep.timeline.cirno.GlobalVars.FreezeMethod;
import static nep.timeline.cirno.GlobalVars.v2_uid;
import static nep.timeline.cirno.GlobalVars.v2_frozen;

import nep.timeline.cirno.GlobalVars;

public class FrozenRW {
    public static final String cgroupV2 = "/sys/fs/cgroup";

    public static void frozen(int uid, int pid) {
        if(FreezeMethod.equals(v2_uid))
            RWUtils.writeFrozen(cgroupV2 + "/uid_" + uid + "/pid_" + pid + "/cgroup.freeze", 1);
        else;
    }


    public static void thaw(int uid, int pid) {
        if(FreezeMethod.equals(v2_uid))
            RWUtils.writeFrozen(cgroupV2 + "/uid_" + uid + "/pid_" + pid + "/cgroup.freeze", 0);
        else;
    }
}
