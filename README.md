Thanks to the following tutorial:
http://www-inf.it-sudparis.eu/~nguyen_n/teaching_assistant/servlet-jsp/helloworld-tomcat

javac -cp /data/apache-tomcat-7.0.53/lib/servlet-api.jar HelloServlet.java

1.Download Apache Tomcat to your PC./n
2.Extract and move it to appropriate folder.
3.Go to [your tomcat]/bin and run: startup.sh
4.Open your browser and type: http://localhost:8080/ to verify if your tomcat is running.
5.Back to [your tomcat]/bin and run: shutdown.sh
6.Refresh your browser to check whether your tomcat was stopped.


Creating "HelloWorld" servlet

Create a folder named “hello”: mkdir hello.
Then create a folder named WEB-INF inside hello, and a folder named classes inside WEB-INF:

cd hello
mkdir WEB-INF
cd WEB-INF
mkdir classes
Create a Java class in the WEB-INF/classes folder, named it HelloServlet.java and insert the following source codes: 

import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet {
 
	protected void service(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	    resp.setContentType("text/html");
	    PrintWriter out = resp.getWriter();		
	    out.println("<HTML>");
	    out.println("<BODY>");
	    out.println("Hello World !!!");
	    out.println("</HTML>");
	    out.println("</BODY>");
	}
 
}
Compile the HelloServlet.java by executing: 

javac -cp [your tomcat]/lib/servlet-api.jar HelloServlet.java
You will get a file HelloServlet.class in the same folder.
In folder WEB-INF, create a file web.xml with the following content 

<web-app>
    <servlet>
              <servlet-name>HelloServletName</servlet-name>
              <servlet-class>HelloServlet</servlet-class>
     </servlet>
     <servlet-mapping>
             <servlet-name>HelloServletName</servlet-name>
             <url-pattern>/HelloWorld</url-pattern>
     </servlet-mapping>
</web-app>
Deploying the "HelloWorld" servlet

Copy the folder hello to [your tomcat]/webapps folder.
Start your Tomcat. (if your Tomcat is running, your don't need to restart it because it updates applications dynamically)
Open http://localhost:8080/hello/HelloWorld, you will see the message: “Hello World!!!” 
