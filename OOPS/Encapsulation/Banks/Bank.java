package OOPS.Encapsulation.Banks;

class Account {
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
        return password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }

    public void printInfo(){
        System.out.println("Name - " + this.name + "\n" +
                           "email - "+this.email + "\n" +
                           "Password - " + getPassword());
    }


}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Ujjwal Jamuar";
        account1.email = "ujjwal@gmail.com";
        account1.setPassword("Ujjwal");

        account1.printInfo();
    }
}
