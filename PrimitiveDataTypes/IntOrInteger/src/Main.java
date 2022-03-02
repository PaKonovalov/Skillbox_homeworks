public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
<<<<<<< HEAD
        for (int i = 0; i <= 65535; i++) {
            if ((char) i == 'Ё' || (char) i == 'ё') {
                System.out.println(i + " - " + (char) i);
            } else if ((char) i >= 'А' && (char) i <= 'я') {
                System.out.println(i + " - " + (char) i);
            }
        }
    }
}
=======

    }
}
>>>>>>> 03b9394dc52757571fb9d141972d9f4223ff2a15
