package com.dh.taobao.util;

import java.util.UUID;

/**
 * @author DH
 */
public class PubTools {

    public static String getUuid(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }

}
