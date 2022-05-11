package file

import org.junit.jupiter.api.Test

class GroovyTestFile {

    @Test
    void testGroovyReadFile(){

        File file = new File('src/test/resources/data.txt')
        file.eachLine {line, index -> println "$line : $index"}
        file.eachLine {println it}
        file.eachLine {name ->println "$name"}
    }

    @Test
    void testGroovyWriteFile(){

        File file = new File('src/test/resources/data.txt')
        file << "\n${new Date()}"
    }
}
