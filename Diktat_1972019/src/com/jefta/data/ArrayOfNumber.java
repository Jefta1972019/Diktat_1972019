package com.jefta.data;
import com.jefta.exceptions.ArrayException;
import java.util.Arrays;

//1972019-JeftaBenedictAmpouw
public class ArrayOfNumber{
    protected Integer[] numbers;

    public void constructArray() throws ArrayException{
        if (numbers == null){
            numbers = new Integer[0];
            throw new ArrayException("array baru dibuat");
        }
        else{
            throw new ArrayException("array sudah dibuat");
        }
    }

    public void increaseArrayIndex() throws ArrayException{
        if(numbers == null){
            throw new ArrayException("array belum dibuat");
        }
        else{
            numbers = Arrays.copyOf(numbers,numbers.length+1);
            System.out.println("array ditambahkan");
        }
    }

    public void addValueToArray(int index, int value) throws ArrayException {
        if (numbers == null) {
            throw new ArrayException("array belum dibuat");
        }
        else if (numbers.length - 1 <index) {
            throw new ArrayException("index tidak ada pada array");
        }
        else {
            numbers[index] =value;
        }
    }

    public void showArray() throws ArrayException{
        if(numbers == null){
            throw new ArrayException("array belum dibuat");
        }
        else{
            System.out.println("isian array: "+ Arrays.toString(numbers));
        }
    }
}
