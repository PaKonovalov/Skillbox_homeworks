public class Main {
    public static void main(String[] args) {
        int vasyaAge = 25, mashaAge = 22, mishaAge = 35;
        int min, middle, max;

        if (vasyaAge < mashaAge && mashaAge < mishaAge) {
            min = vasyaAge;
            middle = mashaAge;
            max = mishaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        } else if (vasyaAge < mishaAge && mishaAge < mashaAge) {
            min = vasyaAge;
            middle = mishaAge;
            max = mashaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        } else if (mashaAge < vasyaAge && vasyaAge < mishaAge) {
            min = mashaAge;
            middle = vasyaAge;
            max = mishaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        } else if (mashaAge < mishaAge && mishaAge < vasyaAge) {
            min = mashaAge;
            middle = mishaAge;
            max = vasyaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        } else if (mishaAge < vasyaAge && vasyaAge < mashaAge) {
            min = mishaAge;
            middle = vasyaAge;
            max = mashaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        } else if (mishaAge < mashaAge && mashaAge < vasyaAge) {
            min = mishaAge;
            middle = mashaAge;
            max = vasyaAge;
            System.out.println("Minimal age: " + min + '\n' + "Middle age: " + middle + '\n' + "Max age: " + max);
        }
    }
    }