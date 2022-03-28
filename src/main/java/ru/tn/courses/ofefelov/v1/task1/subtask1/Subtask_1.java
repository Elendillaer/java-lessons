package ru.tn.courses.ofefelov.v1.task1.subtask1;

public class Subtask_1 {
    public static void main(String[] args) {
        int[] massive = {1, 2, 3, 4, 5};
        int k = 2;
        int summ = 0;
        for (int counter = 0; counter < massive.length; counter++) {
            if (massive[counter] % k == 0) {
                summ += massive[counter];
            }
        }
        System.out.println(summ);
    }
}
