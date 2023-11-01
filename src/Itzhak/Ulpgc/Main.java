package Itzhak.Ulpgc;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LoaderChampion loader= new TsvFileLoaderChampion(new File("LoL.txt"));
        List<Champion> champions= loader.load();
        HashMap<String,Integer> chart= new   HashMap<>();
        for (Champion champion: champions){
            String clase= champion.getClase();
            chart.put(clase,chart.getOrDefault(clase,0)+1);
        }
        for (String key: chart.keySet()){
            System.out.println(key +": "+ chart.get(key));
        }


    }
}
