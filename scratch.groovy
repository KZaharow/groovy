print 'hello world'

def badRead() {
    new File('doesNotExist.txt').text
}

shouldFail(FileNotFoundException) {
    badRead()
}