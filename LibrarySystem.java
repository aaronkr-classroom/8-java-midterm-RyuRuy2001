public class LibrarySystem {
	private Book[] booklist;
	private static int bookCount = 0;
	private static final int NUM_BOOK = 10;
	public LibrarySystem() {
	    this.booklist = new Book[NUM_BOOK]; // 생성자
	}
	
	
	public void addBook(Book book) {
		booklist[bookCount++] = new LibraryBook(book);
			
		}

	
	public void removeBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title)) {
				for ( int j = i; j < bookCount - 1; j++ ) {
					booklist[j] = booklist[j+1];
				}
				booklist[--bookCount] = null;
				System.out.println("라이브러리에서 '" + title + "' 삭제했습니다.");
				return; 
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
}
	public void borrowBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title))
			if ( !booklist[i].isAvailable())  {
				System.out.println("책을 찾았습니다.");
			}else {
				System.out.println("책을 찾지 못했습니다.");
			}
				return; 
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}

	public void returnBook(String title) {
		for ( int i = 0; i < bookCount; i++ ) {
			if ( booklist[i].getTitle().equals(title))
			if ( booklist[i].isAvailable())  {
				System.out.println("책을 찾았습니다.");
			}else {
				System.out.println("책을 찾지 못했습니다.");
			}
				return; 
		}
		System.out.println("# 오류: '" + title + "' 못 찾았습니다!");
	}
			
	public void displayAllBooks() {
		for (int i = 0; i < bookCount; i++) {
			System.out.print(booklist[i].getIsbn() + " | ");
			System.out.print(booklist[i].getTitle() + " | ");
			System.out.print(booklist[i].getAuthor() + " | ");
			System.out.print(booklist[i].getYear() + " | ");
			System.out.print(booklist[i].isAvailable() + " | ");
			System.out.println("");
	} 
		}}


