package org.apache.commons.lang3;
public class ArrayUtils {
    public static void reverseArray(char[] a) { if(a==null) return; int len = a.length; for(int i=0; i<len/2; i++) { char t = a[i]; a[i] = a[len-1-i]; a[len-1-i] = t; } }
}