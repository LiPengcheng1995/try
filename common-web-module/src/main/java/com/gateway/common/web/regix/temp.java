package com.gateway.common.web.regix;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class temp {
    public static void main(String[] args) throws IOException {

        String filePath = "F:/1.html";
        FileInputStream fin = new FileInputStream(filePath);
        InputStreamReader reader = new InputStreamReader(fin);
        BufferedReader buffReader = new BufferedReader(reader);
        String strTmp = "";
        String result = "";
        while ((strTmp = buffReader.readLine()) != null) {
            result += strTmp + "\r\n";
        }
        buffReader.close();

        String str = result;
//        String str = "<li id=\"li1_0\"><div class=\"loldytt\"><input type=\"checkbox\" value=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" name=\"CopyAddr1\" style=\"vertical-align:middle\" class=\"1addr\"><div><span id=\"s1p0\"><a href=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" title=\"[ËÀÉñDVD°æ][001][dvdrip][GB_RV10][720¡Á540]\" target=\"_self\">[ËÀÉñDVD°æ][001][dvdrip][GB_RV10][720¡Á540]</a></span><input type=\"text\" value=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" style=\"vertical-align: middle; width: 322px;\" id=\"lin1k0\"></div></div><div class=\"dwon_xl\"><a target=\"_self\" href=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" thurl=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" mc=\"\" title=\"Ñ¸À×ÏÂÔØ\" id=\"1thUrlid0\" class=\"dwon1\">Ñ¸À×ÏÂÔØ</a></div><div class=\"dwon_tx\"><a class=\"qq-down\" href=\"qqdl://aHR0cDovL2J0LjJ0dS5jYy9GNTA4NzY1NjgyNkExQjk1NEYzNjY4QzA3ODMwMjBDQjE4RUM4NDNCL1vRuLKl07DUund3dy5YdW5Cby5DY11by8DJ8URWRLDmXVswMDFdW2R2ZHJpcF1bR0JfUlYxMF1bNzIwocE1NDBdLnJtdmI=\" qhref=\"qqdl://aHR0cDovL2J0LjJ0dS5jYy9GNTA4NzY1NjgyNkExQjk1NEYzNjY4QzA3ODMwMjBDQjE4RUM4NDNCL1vRuLKl07DUund3dy5YdW5Cby5DY11by8DJ8URWRLDmXVswMDFdW2R2ZHJpcF1bR0JfUlYxMF1bNzIwocE1NDBdLnJtdmI=\" filename=\"\" title=\"Ðý·çÏÂÔØ\" target=\"_self\">Ðý·çÏÂÔØ</a></div><div class=\"dwon_xf\"><a href=\"https://d.miwifi.com/d2r/?url=dGh1bmRlcjovL1FVRm9kSFJ3T2k4dlluUXVNblIxTG1OakwwWTFNRGczTmpVMk9ESTJRVEZDT1RVMFJqTTJOamhETURjNE16QXlNRU5DTVRoRlF6ZzBNMEl2VzlHNHNxWFRzTlM2ZDNkM0xsaDFia0p2TGtOalhWdkx3TW54UkZaRXNPWmRXekF3TVYxYlpIWmtjbWx3WFZ0SFFsOVNWakV3WFZzM01qQ2h3VFUwTUYwdWNtMTJZbHBh\" title=\"Ð¡Ã×ÏÂÔØ\">Ð¡Ã×ÏÂÔØ</a></div><div class=\"dwon_y\"><a href=\"javascript:video(0);\" onclick=\"start(&#39;thunder://QUFodHRwOi8vYnQuMnR1LmNjL0Y1MDg3NjU2ODI2QTFCOTU0RjM2NjhDMDc4MzAyMENCMThFQzg0M0IvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMV1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa&#39;)\" title=\"Ñ¸À×Ó°Òô\" target=\"_self\">Ñ¸À×Ó°Òô</a></div></li>\n" +
//                "<li id=\"li1_1\"><div class=\"loldytt\"><input type=\"checkbox\" value=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" name=\"CopyAddr1\" style=\"vertical-align:middle\" class=\"1addr\"><div><span id=\"s1p1\"><a href=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" title=\"[ËÀÉñDVD°æ][002][dvdrip][GB_RV10][720¡Á540]\" target=\"_self\">[ËÀÉñDVD°æ][002][dvdrip][GB_RV10][720¡Á540]</a></span><input type=\"text\" value=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" style=\"vertical-align: middle; width: 322px;\" id=\"lin1k1\"></div></div><div class=\"dwon_xl\"><a target=\"_self\" href=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" thurl=\"thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa\" mc=\"\" title=\"Ñ¸À×ÏÂÔØ\" id=\"1thUrlid1\" class=\"dwon1\">Ñ¸À×ÏÂÔØ</a></div><div class=\"dwon_tx\"><a class=\"qq-down\" href=\"qqdl://aHR0cDovL2J0LjJ0dS5jYy9DMzc3ODlFRDg2OTQ5MzdFNTM1MDYwRTIyOTZFQjZGMUMwMUFGMEEwL1vRuLKl07DUund3dy5YdW5Cby5DY11by8DJ8URWRLDmXVswMDJdW2R2ZHJpcF1bR0JfUlYxMF1bNzIwocE1NDBdLnJtdmI=\" qhref=\"qqdl://aHR0cDovL2J0LjJ0dS5jYy9DMzc3ODlFRDg2OTQ5MzdFNTM1MDYwRTIyOTZFQjZGMUMwMUFGMEEwL1vRuLKl07DUund3dy5YdW5Cby5DY11by8DJ8URWRLDmXVswMDJdW2R2ZHJpcF1bR0JfUlYxMF1bNzIwocE1NDBdLnJtdmI=\" filename=\"\" title=\"Ðý·çÏÂÔØ\" target=\"_self\">Ðý·çÏÂÔØ</a></div><div class=\"dwon_xf\"><a href=\"https://d.miwifi.com/d2r/?url=dGh1bmRlcjovL1FVRm9kSFJ3T2k4dlluUXVNblIxTG1OakwwTXpOemM0T1VWRU9EWTVORGt6TjBVMU16VXdOakJGTWpJNU5rVkNOa1l4UXpBeFFVWXdRVEF2VzlHNHNxWFRzTlM2ZDNkM0xsaDFia0p2TGtOalhWdkx3TW54UkZaRXNPWmRXekF3TWwxYlpIWmtjbWx3WFZ0SFFsOVNWakV3WFZzM01qQ2h3VFUwTUYwdWNtMTJZbHBh\" title=\"Ð¡Ã×ÏÂÔØ\">Ð¡Ã×ÏÂÔØ</a></div><div class=\"dwon_y\"><a href=\"javascript:video(0);\" onclick=\"start(&#39;thunder://QUFodHRwOi8vYnQuMnR1LmNjL0MzNzc4OUVEODY5NDkzN0U1MzUwNjBFMjI5NkVCNkYxQzAxQUYwQTAvW9G4sqXTsNS6d3d3Llh1bkJvLkNjXVvLwMnxRFZEsOZdWzAwMl1bZHZkcmlwXVtHQl9SVjEwXVs3MjChwTU0MF0ucm12Ylpa&#39;)\" title=\"Ñ¸À×Ó°Òô\" target=\"_self\">Ñ¸À×Ó°Òô</a></div></li>";
        String newStr = str.replaceAll(" ", "");
        Pattern pattern = Pattern.compile("^<liid=\"li1_[\\S]{1,5}?\"><divclass=\"loldytt\"><inputtype=\"checkbox\"value=\"([\\S]{50,200}?)\"name=\"CopyAddr1\"style=\"vertical-align:([\\S]{1000,3000}?)</a></div></li>$", Pattern.MULTILINE); // 保存一个副本
        Matcher matcher = pattern.matcher(newStr);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
