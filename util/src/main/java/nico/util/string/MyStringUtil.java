package nico.util.string;

import org.apache.commons.lang3.StringUtils;

/**
 * Created with IntelliJ IDEA.
 * User: ngandriau
 * Date: 16/08/12
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyStringUtil {

    public static boolean islank(String str){
        return StringUtils.isBlank(str);
    }
}
