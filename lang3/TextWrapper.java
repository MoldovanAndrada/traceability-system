package org.apache.commons.lang3;
public class TextWrapper {
      public static String wrap(String str, int w) { if(str==null) return null; if(w < 1) return str; return str.length() > w ? str.substring(0,w) + "\n" + str.substring(w) : str; }
}
