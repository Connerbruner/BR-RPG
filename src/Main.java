import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter Size");
        Scanner scanner = new Scanner(System.in);
        int size =scanner.nextInt();
        Area[][] areaGrid = new Area[size][size];
        for(int i=size; i>0;i--) {
            for(int j=size; j>0;j--) {
                areaGrid[i][j] = new Area(new boolean[0]);
            }
        }
        for(int i=size; i>0;i--) {
            for(int j=size; j>0;j--) {
                for(int k=0; i>areaGrid[i][j].walls.length; i++) {
                    areaGrid[i][j].walls[k]
                }
            }
        }


    }
    public static int randomint(int h,int l) {
        return l + (int)(Math.random() * ((h - l) + 1));
    }
    public static int randomint(int h) {
        int l=0;
        return randomint(l,h);
    }


}