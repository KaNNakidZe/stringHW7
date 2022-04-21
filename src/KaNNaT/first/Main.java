package KaNNaT.first;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Task # 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

    // Task # 2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUp);

    // Task # 3
        fullName = "Иванов Семен Семенович";
        String fullNameReplace = fullName.replace("ё", "e");
        System.out.println("Данные ФИО сотрудника — " + fullNameReplace);

    // Task # 4 - Четвертого задания нет в домашнем задании урока 1.7. Строки.
       // Только задания повышенной сложности


    }
}
