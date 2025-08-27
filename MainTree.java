package PERTEMUAN6;

public class MainTree {
    public static void main(String[] args) {
        Tree theTree = new Tree();

        theTree.add(42);
        theTree.add(21);
        theTree.add(38);
        theTree.add(27);
        theTree.add(71);
        theTree.add(82);
        theTree.add(55);
        theTree.add(63);
        theTree.add(6);
        theTree.add(2);
        theTree.add(40);
        theTree.add(12);

        System.out.println("Preorder:");
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 12:");
        theTree.remove(12);
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 55:");
        theTree.remove(55);
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 21:");
        theTree.remove(21);
        theTree.preorderTraversal();
        System.out.println();

        System.out.println("\nMenghapus 42:");
        theTree.remove(42);
        theTree.preorderTraversal();
    }
}
