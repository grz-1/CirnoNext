package nep.timeline.cirno.utils;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

import nep.timeline.cirno.log.Log;

public class RWUtils {
    public static String readConfig(String name) {
        try {
            return String.join("\n", FileUtils.readLines(new File(name), StandardCharsets.UTF_8));
        } catch (IOException e) {
            Log.e("Read Config", e);
        }

        return "";
    }

    public static void writeStringToFile(File file, String value) throws IOException {
        writeStringToFile(file, value + "\n", false);
    }

    public static void writeStringToFile(File file, String value, boolean append) throws IOException {
        FileUtils.write(file, value + "\n", StandardCharsets.UTF_8, append); //追加写入
    }

    public static boolean writeFrozen(String path, int value) {
        try (PrintWriter writer = new PrintWriter(path)) {
            writer.write(Integer.toString(value));
            return true;
        } catch (FileNotFoundException ignored) {
            Log.e(path + " | 文件不存在, 此进程可能已死亡, 或者你的设备不支持cgroup v2");
            return false;
        }
    }

}
