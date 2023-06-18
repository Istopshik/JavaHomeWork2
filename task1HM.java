import java.util.Scanner;

public class task1HM {
    public static void main(String[] args) {
        // 1) Дана строка sql-запроса "select * from students WHERE ". Сформируйте часть
        // WHERE этого запроса, используя StringBuilder. Данные для фильтрации приведены
        // ниже в виде json-строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow",
        // "age":"null"}
        // Вывод: select * from students WHERE name=Ivanov AND country=Russia AND
        // city=Moscow
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "Введите ваши данные. Если введете 'null', то данные не будут введены: ");
        System.out.println("Ваша Фамилия: ");
        String name = scan.nextLine();
        System.out.println("Ваша страна: ");
        String country = scan.nextLine();
        System.out.println("Ваш город: ");
        String city = scan.nextLine();
        System.out.println("Ваш возвраст: ");
        String age = scan.nextLine();
        scan.close();

        StringBuilder stroka = new StringBuilder("select * from students WHERE ");
        if (name.equals("null")) {

        } else {
            stroka.append(" Name = " + name);
        }
        ;
        if (country.equals("null")) {

        } else {
            stroka.append(" Country = " + country);
        }
        ;
        if (city.equals("null")) {

        } else {
            stroka.append(" City = " + city);
        }
        ;
        if (age.equals("null")) {

        } else {
            stroka.append(" Age = " + age);
        }
        ;
        System.out.println(stroka.toString());
    }

}
