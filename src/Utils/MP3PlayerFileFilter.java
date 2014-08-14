package Utils;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class MP3PlayerFileFilter extends FileFilter {

    private final String fileExtension;
    private final String fileDescription;

    public MP3PlayerFileFilter(String fileExtension, String fileDescription) {
        this.fileExtension = fileExtension;
        this.fileDescription = fileDescription;
    }

    @Override
    public boolean accept(File f) {
        return f.isDirectory() || f.getAbsolutePath().endsWith(fileExtension);
    }

    @Override
    public String getDescription() {
        return fileDescription + "(*." + fileExtension + ")";
    }

}
