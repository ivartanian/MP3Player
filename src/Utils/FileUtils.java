package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;

public class FileUtils {

    public static void addFileFilter(JFileChooser jfc, FileFilter ff) {
        jfc.removeChoosableFileFilter(jfc.getFileFilter());
        jfc.addChoosableFileFilter(ff);
        jfc.setSelectedFile(new File(""));
    }

    public static String getFileNameWithoutExtension(String filename) {
        int index = filename.lastIndexOf(".");
        if (index > 0 && index < filename.length()) {
            return filename.substring(0, index);
        }
        return "noname";
    }

    public static String getFileExtension(File file) {
        String ext = null;
        String fileName = file.getName();
        int index = fileName.lastIndexOf(".");
        if (index > 0 && index < fileName.length() - 1) {
            ext = fileName.substring(index + 1).toLowerCase();
        }
        return ext;
    }

    public static void Serializable(Object object, String fileName) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(fileName);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.flush();
            oos.close();
            fos.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (oos != null) {
                    oos.close();
                }

            }
            catch (IOException ex) {
                Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static Object Deserializable(String fileName) {
     
        Object object = null;
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {

            fis = new FileInputStream(fileName);
            ois = new ObjectInputStream(fis);
            object = (Object) ois.readObject();
            ois.close();
            fis.close();
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            }
            catch (IOException ex) {
                Logger.getLogger(FileUtils.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        return object;
        
    }

}
