public class Demo {
    public static void main(String[] args) {
        Book[] listBook = new Book[5];
        listBook[0] = new Book("Dan than", "Tg1", 60, 3, 0.3 );
        listBook[1] = new Book("Doraemon", "Tg2", 16, 4, 0.1 );
        listBook[2] = new Book("Toan hoc 1", "Tg3", 40 , 2, 0.5 );
        listBook[3] = new Book("Tieng Em", "Tg4", 90 , 5, 0.5 );
        listBook[4] = new Book("Tieng Anh", "Tg5", 100 , 5, 0.5 );

        int sum = getSumQuantity(listBook);
        System.out.println(sum);
    }

    public static int getSumQuantity(Book[] books){
        int sum=0;
        for (int i = 0; i < books.length; i++) {
            sum+=books[i].getQuantity();
        }
        return sum;
    }
}
