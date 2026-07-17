package CustomArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //    ArrayList<Integer> sample = new ArrayList<>();
    //    sample.add(10);
    //    System.out.println(sample);
        CustomArrayList<Integer> sample2 = new CustomArrayList();
        sample2.Add(10);
        System.out.println(sample2);
        //  Try to Create String of the array here we dont need to worry about the type of the data
        CustomArrayList<String> sample3 = new CustomArrayList<>();
        sample3.Add("hi");
        

        CustomArrayList<Boolean> sample4 = new CustomArrayList<>();
        sample4.Add(true);
       
        

    }

}
