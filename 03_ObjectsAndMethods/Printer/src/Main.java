public class Main {
    public static void main(String[] args) {
        Printer document = new Printer();
        document.append("текст 1", 12);
        document.append("текст 2", 4);
        document.append("текст 3", 1, "Привет Серафим");
        document.append("текст 4",1);

        document.print("Очередь печати:");
        document.print("Очередь печати:");
    }
}
