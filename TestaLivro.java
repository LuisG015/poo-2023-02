public class TestaLivro {
    public static void main(String[] args) {
        Livro x = new Livro("A menina que roubava livros", "Markus Zusak", 2012, "Intríseca, ");
        Livro y = new Livro("\nThe Brothers Hawthorne", "Jennifer Lynn Barnes", 2023, "Little, Brown Books for Young Readers, ");
        Livro z = new Livro("\nHarry Potter", "J. K. Rowling", 2015, "Pottermore Publishing, ");

        System.out.println(x.toString());
        System.out.println(y.toString());
        System.out.println(z.toString());
    }
    
}