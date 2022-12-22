import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class object
{

    object()
    {
        String s="welcome";
        byte b[]=s.getBytes();
        try{
        FileInputStream read=new FileInputStream("ample.txt");
        FileOutputStream f=new FileOutputStream("mple.txt");
        
        BufferedInputStream bin = new BufferedInputStream(read);
        int i=0;
        while((i=bin.read())!=-1)
        {
            f.write((char)i);
        }
        bin.close();
        
        f.close();
        read.close();
    }catch(Exception e)
    {
        System.out.println(e);
    }

    }

}


public class IO {

    public static void main(String[] args) {
        object n=new object();
    }
    
}
