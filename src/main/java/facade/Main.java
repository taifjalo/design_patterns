package facade;


public class Main {
    public static void main(String[] args) {

        ApiFacade facade = new ApiFacade();

        try {
            String joke = facade.getAttributeValueFromJson(
                "https://api.chucknorris.io/jokes/random",
                "value"
            );
            System.out.println(joke);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

