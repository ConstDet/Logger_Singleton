package ru.netology;

import java.util.*;

public class Main {
    public static Logger instance = Logger.getInstance();
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Integer> communication() {
        instance.Log("Здравствуйте, уважаемый пользователь!");
        instance.Log("Введите два числа");
        instance.Log("Размер списка: ");
        int listSize = Integer.parseInt(scanner.nextLine());
        instance.Log("Верхнюю границу значений элементов в списке: ");
        int topBorder = Integer.parseInt(scanner.nextLine());
        instance.Log("Создаем и наполняем список");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < listSize; i++) {
            arrayList.add(random.nextInt(topBorder) + 1);
        }
        return arrayList;
    }
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        arrayList = communication();
        instance.Log("Вот случайный список: " + arrayList);
        instance.Log("Введите данные для фильтрации: ");
        int filter = Integer.parseInt(scanner.nextLine());
        instance.Log("Запускаем фильтрацию");
        List<Integer> arrayListFilter = new Filter(filter).filterOut(arrayList);
        for (int i : arrayListFilter) {
            instance.Log("Элемент " + i + " прошел");
        }
        instance.Log("Прошло фильтр " + arrayListFilter.size() + " из " + arrayList.size());
        instance.Log("Завершаем программу!");
    }
}