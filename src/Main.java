import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        ArrayList<Node> node = new ArrayList<>();
        node.add(new Node(1));
        node.add(new Node(2));
        node.add(new Node(3));
        node.add(new Node(4));
        node.add(new Node(5));

        System.out.println(Collections.singleton(node));

        System.out.println("Enter which number you wanna move to last place");
        System.out.println(Collections.singleton(node));

        System.out.print("Enter here: ");
        push(node, sc.nextInt());
        System.out.println(Collections.singleton(node));


        System.out.println("If you wanna remove last place of arrayList Y/N");
        String choice2 = sc2.nextLine().toUpperCase(Locale.ROOT);
        if (choice2.equals("Y")) {
            pop(node);
            System.out.println(Collections.singleton(node));
        } else {
            System.out.println("Game over");
        }

        Collections.reverse(node);
        System.out.println("List is printed in reverse");
        System.out.println(Collections.singleton(node));

        backward(node);
    }

    static void push(ArrayList<Node> node, int choice) {
        node.set(node.size() - 1, node.get(choice - 1));
    }

    static void pop(ArrayList<Node> node) {
        node.remove(node.size() - 1);
    }

    static void backward(ArrayList<Node> node) {


        for (int i = 0; i > node.size() - 1; i--) {
            Node swapping1 = node.get(i);
            Node swapping2 = node.get(node.size());


            Node temp = node.get(node.size() - i);
            swapping2 = node.get(i);
            swapping1 = temp;

        }

        for (int i = 0; i < node.size(); i++) {
            System.out.println("This is second: " + node.get(i));
        }

    }
}


