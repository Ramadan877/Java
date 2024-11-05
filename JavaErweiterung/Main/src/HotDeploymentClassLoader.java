import java.io.File;
import java.io.IOException;

public class HotDeploymentClassLoader extends ClassLoader{

    private final String classesDir;
    public HotDeploymentClassLoader(String classesDir){
        this.classesDir = classesDir;

    }
    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            byte[] classData = loadClassData(name);

            return defineClass(name, classData, 0, classData.length);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
}

    private byte[] loadClassData(String className) throws IOException {
        String fileName = classesDir + className.replace('.', File.separatorChar) + ".class";
        return java.nio.file.Files.readAllBytes(new File(fileName).toPath());
    }
}
