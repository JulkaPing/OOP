package sort;

public class BookService {

    /**
     * Метод сортировки выбором книг по их году.
     * @param books неупорядоченные книги
     * @return отсортированные книги по году.
     */
    public Book[] sortBookByYear(Book[] books) {

        for (int left = 0; left < books.length; left++) {
            int minimumYear = left;
            for (int right = left + 1; right < books.length; right++) {
                if (books[right].getCreatedYear() < books[minimumYear].getCreatedYear()) {
                    minimumYear = right;
                }
            }

            Book sortedBooks = books[minimumYear];
            books[minimumYear] = books[left];
            books[left] = sortedBooks;
            }
        return books;
    }
}