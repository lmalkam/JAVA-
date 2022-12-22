class User extends Exception{
    User(String str)
    {
        super(str);
    }
}   

public class excec {

    void normal() throws User
    {
        System.out.println("Chal hat naa");
        throw new User("ERROR");
    }

    public static void main(String[] args) {
        
        excec A=new excec();

        try {
            A.normal();
            
        } catch (User e) {
            System.out.println("Okay what the "+ e.getMessage());
        }
    }
    
}
