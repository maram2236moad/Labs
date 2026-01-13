package Arrayes;

import java.util.Scanner;

public class Arrayes {
    Scanner input = new Scanner(System.in);

    public void Travesal(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.println("Index[" + i + "]" + " = " + a[i]);
    }

    public void Travesal2(int[] a) {
        for (int e : a)
            System.out.println(e);
    }

    public void input(int[] a) {
        System.out.println("enter" + a.length + "numbers:");
        for (int i = 0; i < a.length; i++)
            a[i] = input.nextInt();
    }

    public void update(int[] a, int index, int nvalue) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = nvalue;
    }

    public void delete(int[] a, int index) {
        if (index < 0 || index >= a.length)
            System.out.println("Index not found");
        else
            a[index] = 0;
    }


    public void shifLeft_Delete(int[] a, int index) {
        for (int i = index; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        a[a.length - 1] = Integer.MIN_VALUE;


    }

    public int LinearSearch(int[] a, int svalue) {
        for (int i = 0; i < a.length; i++)
            if (a[i] == svalue)
                return i;
        return -1;

    }

    public void shiftRight_Delete(int[] a, int index) {
        if (index < 0 || index >= a.length) return; // حماية بسيطة
        for (int i = a.length - 1; i > index; i--) {
            a[i] = a[i - 1];
        }
        a[index] = Integer.MIN_VALUE;

    }

    // a{1,2,3,4,5,6,7} s=6 f=4 l=6
    public int binarysearch(int[] a, int svalue, int findex, int lindex) {

        while (findex <= lindex) {
            int mid = (findex + lindex) / 2;//5
            if (svalue == a[mid])
                return mid;
            if (svalue > a[mid])
                findex = mid + 1;
            if (svalue < a[mid])
                lindex = mid - 1;

        }
        return -1;
    }

    public int binarysearch(int[] a, int svalue) {
        int findex = 0;
        int lindex = a.length - 1;
        while (findex <= lindex) {
            int mid = (findex + lindex) / 2;//5
            if (svalue == a[mid])
                return mid;
            if (svalue > a[mid])
                findex = mid + 1;
            if (svalue < a[mid])
                lindex = mid - 1;
        }
        return -1;
    }
}