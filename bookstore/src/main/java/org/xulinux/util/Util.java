package org.xulinux.util;

import com.google.gson.Gson;
import org.springframework.http.converter.json.GsonBuilderUtils;

/**
 * //TODO add class commment here
 *
 * @Author wfh
 * @Date 2022/1/12 下午6:24
 */
public class Util {
    private static final Gson gson = new Gson();

    public static Gson getGson() {
        return gson;
    }
}
