package org.apache.commons.lang3;
public class ArrayUtils {
    public static void reverseArray(char[] b) { if(b==null) return; int len = b.length; for(int i=0; i<len/2; i++) { char t = b[i]; b[i] = b[len-1-i]; b[len-1-i] = t; } }
}
