vips
====

Original Work: https://github.com/tpopela/vips_java Java implementation of VIPS algorithm -- XML output

Fork: https://github.com/GetEvinced/vips HTML output with id tagged to DOM nodes

*Description of VIPS and the implementation*

http://www.fit.vutbr.cz/study/DP/DP.php?id=14163&file=t

*Original work by Microsoft*

http://www.cad.zju.edu.cn/home/dengcai/VIPS/VIPS_July-2004.pdf

Compilation
-----------

This project uses Apache Maven. Compile it by running `mvn compile` or `mvn package` if you want to produce the JAR file.

If you have used the `mvn compile` then run:

``java -cp target/classes/ org.fit.vips.VipsTester``

or if `mvn package`:

``java -cp target/vips-java-1.0-shaded.jar org.fit.vips.VipsTester``

to start the VipsTester.

Usage
-----

Just pass the URL of web page you want to analyze as argument to VipsTester class.

Preferences of implementation can be changed also there.