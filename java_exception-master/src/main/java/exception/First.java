package exception;

public class First {

    public static void main(String[] args) {
        try{
            divideByZero();
        } catch (ArithmeticException er) {
            System.out.println("Чумба, ты совсем поехавший, сходи к мозгоправу попей колёсики");
        }

        try{
            accessToUnexistingElement();
        } catch (IndexOutOfBoundsException er) {
            System.out.println("access denied");
        }

        try{
            playWithNullPointer();
        } catch (NullPointerException er) {
            System.out.println("Null");
        }

        try{
            tryToCreateFunnyArray();
        } catch (NegativeArraySizeException er) {
            System.out.println("Negative zone created");
        }

        try{
            searchSomethingOutString();
        } catch (StringIndexOutOfBoundsException er) {
            System.out.println("Такого в строке нет, лови ошибку");
        }
        System.out.println("Ура! Меня снова печают");
    }


    public static void divideByZero() {
        int a = 777 / (666 - 666);
    }

    public static void accessToUnexistingElement(){
        int[] arr = {1,2,3,4,5,6,7};
        for (int i = 0; i < arr.length+1; i++) {
            System.out.printf("%d,", i);
        }
    }

    public static void playWithNullPointer() {
        String importantData = null;
        System.out.println("important is " + importantData);
    }

    public static void tryToCreateFunnyArray() {
        int i[] = new int[-5];
    }

    public static void searchSomethingOutString() {
        String secret = "Пин-код от карты: 123";
        secret.charAt(22);
    }

}
