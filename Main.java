public class Main {
    public static void main(String[] args){

        Author margarete = new Author("Margarete","Margatron@hotmail.com",'F');
        Author per = new Author("Per Lundare", "perpatrol@gmail.com", 'M');
        Book book1 = new Book("Happiness",margarete,19.99, 7);
        System.out.println(book1);
        Book book2 = new Book( "Salvadores", margarete, 14.89, 13);
        System.out.println(book2);
        Book book3 = new Book("Building Good", per, 39.65, 230);
        System.out.println(book3);
        Book book4 = new Book("Shouldn´t call Lars", per, 99.99);
        System.out.println(book4);
    }
}
