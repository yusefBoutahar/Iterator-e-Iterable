package kata6;

import java.io.File;
import java.util.Iterator;


public class Kata6 {

    public static void main(String[] args) {
            
        File file = new File("/");
        Iterator<Integer> iterator = megabytes(legthsOf(iteratorOf(file.listFiles())));
        while(iterator.hasNext()) System.out.println(iterator.next());
            
    }
    
    private static Iterator<Integer> megabytes(Iterator<Long> legthsOf) {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return legthsOf.hasNext();
            }

            @Override
            public Integer next() {
                return (int)(legthsOf.next() / (1024*1024));
            }
        };
    }
    
    private static Iterator<Long> legthsOf(Iterator<File> iteratorOf) {
        return new Iterator<Long>() {
            @Override
            public boolean hasNext() {
                return iteratorOf.hasNext();
            }

            @Override
            public Long next() {
                return iteratorOf.next().length();
            }
        };

    }

    private static Iterator<File> iteratorOf(File[] listFiles) {
        return new Iterator<File>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < listFiles.length;

            }

            @Override
            public File next() {
                return listFiles[i++];
            }
        };
        
    }

    


    
    
    
}
