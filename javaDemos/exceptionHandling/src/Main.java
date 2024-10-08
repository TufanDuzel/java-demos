public class Main {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[] {1,2,3};
            System.out.println(sayilar[5]);
        } catch (StringIndexOutOfBoundsException exception) {
            System.out.println("Hata olustu: " + exception);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Hata olustu: " + exception);
        } catch (Exception exception) {
            System.out.println("Loglandi: " + exception);
        } finally {
            System.out.println("Finally blogu calisti.");
        }

    }
}