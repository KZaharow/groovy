package file

import org.junit.jupiter.api.Test

class GroovyTestFile {

    @Test
    void testGroovyReadFile(){

        File file = new File('src/test/resources/data.txt')
        file.eachLine {line, index -> println "$line : $index"}
        Object.is()
    }

    @Test
    void testGroovyWriteFile(){

        File file = new File('src/test/resources/data.txt')
        file << "\n${new Date()}"
    }
}
