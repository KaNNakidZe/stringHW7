package KaNNaT.first;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// Task # 1
        String firstName = "Ivan ";
        String middleName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + middleName;
        System.out.println("��� ���������� � " + fullName);

    // Task # 2
        String fullNameUp = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ � " + fullNameUp);

    // Task # 3
        fullName = "������ ����� ���������";
        String fullNameReplace = fullName.replace("�", "e");
        System.out.println("������ ��� ���������� � " + fullNameReplace);

    // Task # 4 - ���������� ������� ��� � �������� ������� ����� 1.7. ������.
       // ������ ������� ���������� ���������


    }
}
