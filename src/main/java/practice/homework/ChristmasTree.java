package practice.homework;

public class ChristmasTree {
    public static void main(String[] args) {
        int christmasTreeSize = 7;
        System.out.println("Size of the Christmas tree:\n" + christmasTreeSize);
        do {
            int noBranches = christmasTreeSize;
            while (noBranches > 0) {
                System.out.print(" ");
                noBranches--;
            }
            int withBranches = 15-christmasTreeSize*2;
            while (withBranches > 0) {
                System.out.print("*");
                withBranches--;
            }
            System.out.println("");
            christmasTreeSize--;
        } while (christmasTreeSize > 0);
    }
}
