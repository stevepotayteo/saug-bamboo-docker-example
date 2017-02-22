public class HelloWorld {
    private String name;
    private String message;

    public HelloWorld() {
        this.name = new String();
        this.message = "Hello World1!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}