set projectLocation=C:\Edureka_Jan_Workspace\Craftsvilla
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\Jars\*
java org.testng.TestNG %projectLocation%\testng.xml
pause