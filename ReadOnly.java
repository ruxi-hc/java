package AA.FileSystemOpertions;

import java.io.File;
import java.io.IOException;

//372改变文件属性
public class ReadOnly {
    public static void mian(String[] args)throws IOException{
        File f=new File("f");
        if (!f.createNewFile()){
            System.out.println("Can't create new file");
            return;
        }
        if (!f.canWrite()){
            System.out.println("Can't write new file!");
            return;
        }
        if (!f.setReadOnly()){
            System.out.println("Grrr! Can't set file read-only.");
            return;
        }
        if (f.canWrite()){
            System.out.println("Most immutable,captain!");
            System.out.println("But it still says canWrite() after setReadOnly");
        }else{
            System.out.println("Logical,captain!");
            System.out.println("canWrite() correctly returns false after setReadOnly");
        }

    }
}
