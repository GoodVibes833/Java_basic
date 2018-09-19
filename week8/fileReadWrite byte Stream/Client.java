package Chapter15;

public class Client {

    public static void main(String[] args) {

//        MyFileIO.openFileToWriteInfo("students/Alex.txt");
//        MyFileIO.addInfo();
//        MyFileIO.closeFile();
//        MyFileIO.openFileToReadInfo("students/Alex.txt");
//        MyFileIO.readInfo();
//        MyFileIO.closeFile();
        SequentialFileIO.openFileToWrite();
        SequentialFileIO.writeContent();

        SequentialFileIO.openFileToRead();
        SequentialFileIO.readContent();
        SequentialFileIO.closeFile();





    }
}
