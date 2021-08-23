package greedyAlgorithms;

//Жадный алгоритм
/*Вы едите на автомобиле.
 * Автомобиль может проехать на одной заправке 400 км.
 * На пути от точки А до точки В есть несколько заправок.
 * Надо проехать от точки А до точки В с минимальным количеством остановок на заправку.
 * А-0 км; F1=200 км; F2=375 км; F3=550 км; F4=750 км; В=950 км */

public class Fuel {
    public static void main(String[] args) {
        int[] stations = {0, 200, 375, 550, 750, 950};
        System.out.println(minStops(stations, 400));

    }

    public static int minStops(int[] stations, int capacity) {
        int result = 0;
        int currentStop=0;

        while(currentStop<stations.length-1){
            int nextStop=currentStop;

            while(nextStop<stations.length-1 && stations[nextStop+1]-stations[currentStop]<=capacity)
                nextStop++;

            if(currentStop==nextStop)
                return -1;
            if(nextStop<stations.length-1)
                result++;
            currentStop=nextStop;
        }
        return result;
    }
}
