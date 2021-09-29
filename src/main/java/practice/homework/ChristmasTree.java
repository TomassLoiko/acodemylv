package practice.homework;

public class ChristmasTree {
    public static void main(String[] args) {
        int christmasTreeSize = 20;
        int branches = christmasTreeSize*2+1;
        System.out.println("Size of the Christmas tree:\n" + christmasTreeSize);
        do {
            int noBranches = christmasTreeSize;
            while (noBranches > 0) {
                System.out.print(" ");
                noBranches--;
            }
            int withBranches = branches-christmasTreeSize*2;
            while (withBranches > 0) {
                System.out.print("*");
                withBranches--;
            }
            System.out.println("");
            christmasTreeSize--;
        } while (christmasTreeSize > 0);
    }
}
