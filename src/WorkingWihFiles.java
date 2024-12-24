import java.io.*;

class FileCreate{
    public void createFile(String name){
        try{
            File myFile = new File(name);
            if(myFile.createNewFile()){
                System.out.println("file created: "+myFile.getName());
            }else{
                System.out.println("file already exist");
            }
        }catch (IOException e){
            System.out.println("Error occured when creating file");
            e.printStackTrace();
        }
    }
}

class FileWrite{
    public void writeToFile(String name, String content){
        try(FileWriter writer = new FileWriter(name)){
            writer.write(content);
            System.out.println("writing sucess");
        }catch (IOException e){
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }
}

class readFile{
    public void readerFile(String name){
        try(BufferedReader reader = new BufferedReader(new FileReader(name))){
            String line;
            while((line = reader.readLine())!= null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}

class deleteFile{
    public void delete(String name){
        File selectedFile = new File(name);
        if(selectedFile.delete()){
            System.out.println("Deleted sucessfully");
        }else{
            System.out.println("Failed to delete");
        }
    }
}

public class WorkingWihFiles {
    public static void main(String[] args){
        FileCreate creator = new FileCreate();
        creator.createFile("example2.txt");

        FileWrite writer = new FileWrite();
        writer.writeToFile("example2.txt", "This is the content that should be populated in example2.txt file");

        readFile reader = new readFile();
        reader.readerFile("example2.txt");

        deleteFile deleter = new deleteFile();
        deleter.delete("example2.txt");
    }
}
