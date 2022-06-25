package practica3.ej3;

public interface IFile {
    int getNumberOfWords();
    void addChild(IFile file);
    void removeChild(IFile file);
    IFile getChild(int index);
}
