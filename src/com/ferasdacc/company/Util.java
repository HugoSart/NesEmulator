package com.ferasdacc.company;

/**
 * User: hugo_<br/>
 * Date: 30/03/2018<br/>
 * Time: 03:04<br/>
 */
public class Util {

    public static byte changeBit(byte b, int bitIndex, boolean val) {
        return val ? (byte)(b | (1 << bitIndex)) : (byte)(b & ~(1 << bitIndex));
    }

    public static boolean getBit(byte b, int pos) {
        return ((b >> pos) & 1) != 0;
    }

}
