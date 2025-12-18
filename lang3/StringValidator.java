package org.apache.commons.lang3;
public class StringValidator {
    public static boolean checkBlank(CharSequence cs) { return cs == null || cs.toString().trim().isEmpty(); }
    public static boolean isAlpha(String s) { return s != null && s.chars().allMatch(Character::isLetter); }
    public static boolean isPalindrome(String s) { if(s==null) return false; String r = new StringBuilder(s).reverse().toString(); return s.equalsIgnoreCase(r); }
}