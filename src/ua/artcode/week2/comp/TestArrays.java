package ua.artcode.week2.comp;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by serhii on 27.03.16.
 */
public class TestArrays {

    public static void main(String[] args) {
        int[] mas = {67,3,-56,55,9,72};


        int[] cloned =
                Arrays.copyOf(mas, mas.length);

        int[] rangeMas =
                Arrays.copyOfRange(mas, 1, 3);

        Arrays.equals(mas, cloned);

        String strMas = Arrays.toString(mas);

        Arrays.fill(rangeMas, 2);




        Arrays.sort(mas);

        Cat[] cats = new Cat[5];

        cats[0] = new Cat("Vaska", 7, 5);
        cats[1] = new Cat("Murchik", 2, 7);
        cats[2] = new Cat("Rizik", 8, 2);
        cats[3] = new Cat("Cote", 3, 15);
        cats[4] = new Cat("Bonia", 9, 3);

        Object[] m = cats;

        Arrays.sort(cats);
        String res = Arrays.toString(cats);
        res = res.replaceAll("\\}","\\}\n"); // } -> }\n

        System.out.println(res);

        Arrays.sort(cats, new CatNameComparator());


        Arrays.sort(cats, (a, b) -> b.getAge() - a.getAge());

        System.out.println(Arrays.toString(cats).replaceAll("\\}", "\\}\n"));



    }

}


class Cat implements Comparable<Cat> {

    private String petName;

    private double weight;

    private int age;

    public Cat(String petName, double weight, int age) {
        this.petName = petName;
        this.weight = weight;
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public double getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "petName='" + petName + '\'' +
                ", weight=" + weight +
                ", age=" + age +
                '}';
    }



    @Override
    public int compareTo(Cat o) {
        return this.age - o.age;
    }
}

class CatNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getPetName().compareTo(o2.getPetName());
    }
}
