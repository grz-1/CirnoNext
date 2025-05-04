package nep.timeline.cirno;

import nep.timeline.cirno.configs.settings.ApplicationSettings;
import nep.timeline.cirno.configs.settings.GlobalSettings;

public class GlobalVars {
    public static final String TAG = "Cirno";
    public static final String CONFIG = "Cirno";
    public final static String CONFIG_DIR = "/data/system/" + GlobalVars.CONFIG;
    public final static String LOG_DIR = CONFIG_DIR + "/log";
    public static ClassLoader classLoader;
    public static GlobalSettings globalSettings = null;
    public static ApplicationSettings applicationSettings = null;
    public static String FreezeMethod = "V2_UID";
    public static String LogMethod = "LSPosed" ;
    public final static String v2_frozen = "V2_FROZEN";

    public final static String v2_uid = "V2_UID";

}
