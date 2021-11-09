public class Printer {
   private String queue = "";
   private int pendingPages = 0;
   private int pageHistory = 0;



   public void append(String textOfTheDocument) {
        append(textOfTheDocument,1,"");
    }

   public void append(String documentName, int pageCount) {
        append(documentName, pageCount, "");
    }

   public void append(String documentName, int pageCount, String textOfTheDocument) {
       if (textOfTheDocument.isEmpty()) {
           queue = queue + "Имя документа: " + documentName + ", количество страниц: " + pageCount + "\n";
       } else {
           queue = queue + "Имя документа: " + documentName + ", количество страниц: " + pageCount + " Текст:  " + textOfTheDocument + "\n";
       }
       pendingPages += pageCount;
   }

    public int getPrintPageHistory() {
        return  pageHistory;
    }

    public int getPendingPagesCount() {
       return  pendingPages;
    }

   public void clear() {
      queue = "";
      pendingPages = 0;
    }

   public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Проверка очереди: " + getPendingPagesCount() + " стр.");
            System.out.println("Нет документов на печать");
            System.out.println("Общее количество распечатанных страниц за все время: " + getPrintPageHistory());
            } else {
            System.out.print(queue);
            System.out.println("Общее количество страниц в очереди: " + getPendingPagesCount());
            pageHistory += getPendingPagesCount();
        }

    }
}