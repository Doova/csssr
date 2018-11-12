Необходимые средства:

1.JDK - http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

2.Maven - https://maven.apache.org/download.cgi

После их установки не забыть прописать в переменные среды следующее:

 JAVA_HOME – ведет на jdk папку в папке Java
MAVEN_HOME и M2_HOME – ведет на папку Maven куда вы её скопировали

PATH – ДОБАВЛЯЕМ В КОНЕЦ “%JAVA_HOME%\bin;%MAVEN_HOME%\bin;”

После, в терминале IDE пишем: mvn test -Dtest=MainTest
