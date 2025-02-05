public class StringExample {
    public static void main(String[] args) {
        // Создание строк
        String str1 = "Привет";
        String str2 = "Мир";

        // Конкатенация строк
        String concatenated = str1 + " " + str2;
        System.out.println("Конкатенированная строка: " + concatenated);

        // Сравнение строк
        String str3 = "Привет";
        String str4 = "привет";

        if (str1.equals(str3)) {
            System.out.println("str1 и str3 одинаковые.");
        } else {
            System.out.println("str1 и str3 разные.");
        }

        // Сравнение строк с учетом регистра
        if (str1.equalsIgnoreCase(str4)) {
            System.out.println("str1 и str4 одинаковые (игнорируется регистр).");
        } else {
            System.out.println("str1 и str4 разные (с учетом регистра).");
        }

        // Получение подстроки
        String subString = concatenated.substring(7, 10);
        System.out.println("Подстрока: " + subString);

        // Проверка, содержит ли строка подстроку
        if (concatenated.contains("Мир")) {
            System.out.println("Строка содержит слово 'Мир'.");
        } else {
            System.out.println("Строка не содержит слово 'Мир'.");
        }

        // Преобразование строки в верхний и нижний регистр
        String upperCase = concatenated.toUpperCase();
        String lowerCase = concatenated.toLowerCase();
        System.out.println("В верхнем регистре: " + upperCase);
        System.out.println("В нижнем регистре: " + lowerCase);

        // Удаление пробелов в начале и в конце строки
        String strWithSpaces = "  Привет, мир!  ";
        String trimmed = strWithSpaces.trim();
        System.out.println("Строка без пробелов по краям: '" + trimmed + "'");
    }
}
