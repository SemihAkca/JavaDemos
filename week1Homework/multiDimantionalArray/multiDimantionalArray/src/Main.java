public class Main {
    public static void main(String[] args) {
        String[][] cities = new String[3][3];
        cities[0][0] ="İstanbul";
        cities[0][1] ="Bursa";
        cities[0][2] ="Yalova";
        cities[1][0] ="Tekirdağ";
        cities[1][1] ="Bitlis";
        cities[1][2] ="Ankara";
        cities[2][0] ="Bayburt";
        cities[2][1] ="Diyarbakır";
        cities[2][2] ="Samsun";

        for (int i =0; i<cities.length; i++){
            System.out.println("----------");
            for (int j =0; j<cities.length; j++){
                System.out.println(cities[i][j]);
            }
        }
    }
}