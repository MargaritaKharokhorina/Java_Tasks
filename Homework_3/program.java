package Homework_3;

import java.util.*;

public class program {
    public static void main (String [] args) {
        // 1. Реализовать алгоритм сортировки списков компаратором
        System.out.println("Задание 1");
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(new Random().nextInt(5));
        }
        System.out.println(list1);
        list1 = new ArrayList<>(mergeSortList(list1));
        System.out.println(list1);

        // 2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
        System.out.println("Задание 2");
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list2.add(new Random().nextInt(5));
        }
        System.out.println(list2);
        deleteEvenNumbers(list2);
        System.out.println(list2);
    }

    public static ArrayList<Integer> mergeSortList(ArrayList<Integer> src) {
        if (src.size() <= 1) return src;
        ArrayList<Integer> left = new ArrayList<>(src.subList(0, src.size() / 2));
        ArrayList<Integer> right = new ArrayList<>(src.subList(left.size(), src.size()));
        return mergeList(mergeSortList(left), mergeSortList(right));
    }
    private static ArrayList<Integer> mergeList(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(new Integer[left.size() + right.size()]));
        for (int k = 0, i = 0, j = 0; k < result.size(); k++)
            result.set(k, i < left.size() && (j == right.size()
                    || left.get(i) < right.get(j)) ? left.get(i++) : right.get(j++));
        return result;
    }
    public static void deleteEvenNumbers(ArrayList<Integer> list) {
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                list.remove(i--);
            }
            i++;
        }
    }


        
    }
    

