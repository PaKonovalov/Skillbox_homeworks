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
        pageHistory += pendingPages;
    }

   public int getPendingPagesCount() {
        return  pendingPages;
    }
   public int getPrintPageHistory() {
       return pageHistory ;
    }

   public void clear() {
        queue = "";
    }

   public void print(String title) {
        System.out.println(title);
        if (queue.isEmpty()) {
            System.out.println("Нет документов на печать");
            System.out.println("Общее количество распечатанных страниц: " + getPrintPageHistory());
            } else {
            System.out.print(queue);
            System.out.println("Общее количество страниц в очереди: " + getPendingPagesCount());

        }
    }
}