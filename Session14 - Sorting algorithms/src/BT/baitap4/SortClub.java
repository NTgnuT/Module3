package BT.baitap4;

import java.util.Arrays;

public class SortClub {
    static FootballTeam[] teams = new FootballTeam[5];
    static {
        teams[0]=new FootballTeam(5,"Chelsea",26,89);
        teams[1]=new FootballTeam(4,"Liverpool",23,82);
        teams[2]=new FootballTeam(2,"Tottenham",33,77);
        teams[3]=new FootballTeam(1,"Newcastle",24,85);
        teams[4]=new FootballTeam(3,"Reading",29,92);
    }

    public static void main(String[] args) {
//        bubbleSort(teams);
//        System.out.println(Arrays.toString(teams));

//        selectionSort(teams);
//        System.out.println(Arrays.toString(teams));

        insertionSort(teams);
        System.out.println(Arrays.toString(teams));
    }

    public static void bubbleSort (FootballTeam[] teams) {
        for (int i = 0; i < teams.length - 1 ; i++) {
            for (int j = 0; j < teams.length - 1; j++) {
                if (teams[j].getName().compareTo(teams[j+1].getName())>0) {
                    FootballTeam temp = teams[j];
                    teams[j] = teams[j+1];
                    teams[j+1] = temp;
                }
            }
        }
    }

    public static void selectionSort (FootballTeam[] teams) {
        for (int i = 0; i < teams.length - 1; i++) {
            FootballTeam min = teams[i];
            int index = i;
            for (int j = i + 1; j < teams.length; j++) {
                if (min.getNumberOfPlayer() > teams[j].getNumberOfPlayer()) {
                    min = teams[j];
                    index = j;
                }
            }

            if (index != i) {
                teams[index] = teams[i];
                teams[i]=min;
            }
        }
    }

    public static void insertionSort (FootballTeam [] teams) {
        for (int i = 1; i < teams.length; i++) {
            FootballTeam e = teams[i];
            int j;
            for ( j = i - 1; j >= 0 && teams[j].getScore() > e.getScore() ; j--) {
                teams[j+1] = teams[j];
            }
            teams[j+1] = e;
        }
    }
}
