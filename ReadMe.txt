В Groovy спецификатор доступа по умолчанию public.
Это означает, что метод без какого-либо указанного модификатора доступа является общедоступным и доступным
за пределами класса и границ пакета.
В Java модификатор доступа по умолчанию — это пакет, т. е. если вы не укажете модификатор доступа для полей,
методов или класса, он станет package-private

Groovy геттеры и сеттеры автоматически генерируются для членов класса.
Java, вам нужно самому все генерить

Groovy допускает замену переменных с помощью двойных кавычек со строками.
Java не поддерживает замену переменных.

Groovy Информация о типе не является обязательной.
Информация о типе является обязательной в Java.

Groovy не обязательно заканчивать точкой с запятой.
В Java каждое выражение заканчивается точкой с запятой.

Groovy автоматически является классом-оболочкой,  Script, для каждой программы.
В Java вам нужен метод main, чтобы сделать класс исполняемым.

groovy -Dfile.encoding=UTF-8 test Гомель RUB