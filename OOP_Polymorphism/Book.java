class Book extends LibraryItem {

    public Book(String title) {
        super(title);
    }

    @Override
    int getLoanDuration() {
        return 14;
    }
}