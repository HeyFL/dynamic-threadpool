package io.dynamic.threadpool.common.constant;

/**
 * Constants
 *
 * @author chen.ma
 * @date 2021/6/16 23:01
 */
public class Constants {

    public static final String TP_ID = "tpId";

    public static final String ITEM_ID = "itemId";

    public static final String DEFAULT_NAMESPACE_ID = "public";

    public static final String NULL = "";

    public static final String ENCODE = "UTF-8";

    public static final int CONFIG_LONG_POLL_TIMEOUT = 30000;

    public static final String LINE_SEPARATOR = Character.toString((char) 1);

    public static final String WORD_SEPARATOR = Character.toString((char) 2);

    public static final String GENERAL_SPLIT_SYMBOL = ",";

    public static final String LONG_POLLING_LINE_SEPARATOR = "\r\n";

    public static final String BASE_PATH = "/v1/cs";

    public static final String CONFIG_CONTROLLER_PATH = BASE_PATH + "/configs";

    public static final String LISTENER_PATH = CONFIG_CONTROLLER_PATH + "/listener";

    public static final String PROBE_MODIFY_REQUEST = "Listening-Configs";

    public static final String LONG_PULLING_TIMEOUT = "Long-Pulling-Timeout";

    public static final String LISTENING_CONFIGS = "Listening-Configs";

    public static final String GROUP_KEY_DELIMITER = "+";

}
