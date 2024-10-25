package lv.rvt;

public class App {

    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Gift pc = new Gift("New pc", 7);
        Package gifts = new Package();
        gifts.addGift(pc);
        System.out.println(gifts.totalWeitght());
    }
}