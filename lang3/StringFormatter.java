package org.apache.commons.lang3;
public class StringFormatter {
    public static String toFirstUpper(String in) {  if(in==null) return null; return Character.toUpperCase(in.charAt(0)) + in.substring(1); }
    public static String removeAccents(String s) { return java.text.Normalizer.normalize(s, java.text.Normalizer.Form.NFD).replaceAll("\\p{M}", ""); }
}
