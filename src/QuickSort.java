import java.lang.reflect.Array;
import java.util.Arrays;
public class QuickSort {
    public static void main(String[] args) {
        int[] numeros = {35, 10, 22, 20, 30, 55, 70};

        System.out.println("Los datos no estan ordenados: "+Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Los datos estan ordenados: "+Arrays.toString(numeros));

    }
}
