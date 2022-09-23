import java.util.Scanner;

class Library{
    public String book;
    public String video;
    public String newspaper;

    public Library(String book, String video, String newspaper) {
        this.book = book;
        this.video = video;
        this.newspaper = newspaper;
    }
    public void printLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newspaper);
    }
}

class GenericLibrary <T>
{
    T book, video, newspaper;

    public GenericLibrary(T book, T video, T newspaper) {
        this.book = book;
        this.video = video;
        this.newspaper = newspaper;
    }
    public void printGenericLibrary()
    {
        System.out.println("book = "+book+"\n"+"video = "+video+"\n"+"newspaper = "+newspaper);
    }
}
public class LibraryManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the media as book, video & newspaper:");
        String book = sc.nextLine();
        String video = sc.nextLine();
        String newspaper = sc.nextLine();
        Library media1 = new Library(book, video, newspaper);
        System.out.println("Library has:");
        media1.printLibrary();
        System.out.println("------------***********------------");

        GenericLibrary<String> genericMedia = new GenericLibrary<>(book, video, newspaper);
        System.out.println("Generic Library has:");
        genericMedia.printGenericLibrary();
    }
}
