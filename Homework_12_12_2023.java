package javaPro.homework_210823.Algoritms_homeworks;

//Решите задачу: Расставьте в алфавитном порядке буквы. Разрешается использование техники Разделяй и властвуй. Полученные данные напечатайте.
//👉👉👉  На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
//На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXYZ (с большой буквы)
public class Homework_12_12_2023 {
    public static String sortLetter(String str) {
        if (str.length() <= 1) {
            return str.toUpperCase();
        } else {
            String leftStr = str.substring(0, str.length() / 2);
            String rightStr = str.substring(str.length() / 2);
            String sortedLeftStr = sortLetter(leftStr);
            String sortedRightStr = sortLetter(rightStr);
            return unionLetter(sortedLeftStr, sortedRightStr);
        }
    }
    public static String unionLetter(String leftStr, String rightStr) {
        StringBuilder unionStr = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < leftStr.length() && j < rightStr.length()) {
            if (leftStr.charAt(i) < rightStr.charAt(j)) {
                unionStr.append(leftStr.charAt(i));
                i++;
            } else {
                unionStr.append(rightStr.charAt(j));
                j++;
            }
        }
        while (i < leftStr.length()) {
            unionStr.append(leftStr.charAt(i));
            i++;
        }
        while (j < rightStr.length()) {
            unionStr.append(rightStr.charAt(j));
            j++;
        }
        return unionStr.toString().toUpperCase();
    }


    public static void main(String[] args) {
        String str = "poiuytrewqlkjhgfdsamnbvcxz";
        String sortedStr = sortLetter(str);
        System.out.println("Расставьте в алфавитном порядке буквы: " + sortedStr);
    }

}
