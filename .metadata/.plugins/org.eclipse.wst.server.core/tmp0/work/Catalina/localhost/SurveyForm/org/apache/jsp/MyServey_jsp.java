/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2015-09-30 14:51:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MyServey_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Customer Survey Form</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<FORM  method=\"post\" action=\"Survey\">\r\n");
      out.write("<H1><CENTER style=\"color:RED\"><marquee>Customer Survey Form</marquee></CENTER></H1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<H3>Please tell us a little about yourself. </H3>\r\n");
      out.write("\r\n");
      out.write("<LEFT>\r\n");
      out.write("First Name: <INPUT TYPE=\"text\" NAME=\"Fname\" SIZE=40 MAXLENGTH=80>\r\n");
      out.write("<BR>\r\n");
      out.write("<BR>\r\n");
      out.write("Last Name: <INPUT TYPE=\"text\" NAME=\"Lname\" SIZE=40 MAXLENGTH=80>\r\n");
      out.write("<BR>\r\n");
      out.write("<BR>\r\n");
      out.write("Email Address: <INPUT TYPE=\"text\" NAME=\"Email\" SIZE=40 MAXLENGTH=80>\r\n");
      out.write("<BR>\r\n");
      out.write("<BR>\r\n");
      out.write("Phone No: <INPUT TYPE=\"text\" NAME=\"Phone\" SIZE=40 MAXLENGTH=80>\r\n");
      out.write("<BR>\r\n");
      out.write("<BR>\r\n");
      out.write("</LEFT>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("Customer State:<SELECT NAME=\"State\" >\r\n");
      out.write("<OPTION SELECTED VALUE=\"\"> \r\n");
      out.write("<OPTION VALUE=\"AL\">AL\r\n");
      out.write("<OPTION VALUE=\"CA\">CA\r\n");
      out.write("<OPTION VALUE=\"FL\">FL\r\n");
      out.write("<OPTION VALUE=\"ID\">ID\r\n");
      out.write("<OPTION VALUE=\"IL\">IL\r\n");
      out.write("<OPTION VALUE=\"IN\">IN\r\n");
      out.write("<OPTION VALUE=\"KY\">KY\r\n");
      out.write("<OPTION VALUE=\"MD\">MD\r\n");
      out.write("<OPTION VALUE=\"NJ\">NJ\r\n");
      out.write("<OPTION VALUE=\"NY\">NY\r\n");
      out.write("<OPTION VALUE=\"WA\">WA</SELECT>         \r\n");
      out.write("<P>\r\n");
      out.write("Product: \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Product\" VALUE=\"F\">FIOS TV\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Product\" VALUE=\"I\">Internet \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Product\" VALUE=\"T\">FDV\r\n");
      out.write("   \r\n");
      out.write("<H3> <center>Customer Satisfaction Survey Form</center>\r\n");
      out.write("</H3>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("1.How long was your wait on hold before speaking with our customer service representative?<br> \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q1\" VALUE=\"1\">Extremely long<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q1\" VALUE=\"2\">Quite long <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q1\" VALUE=\"3\">Slightly long<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q1\" VALUE=\"4\">Not at all long<br>\r\n");
      out.write("  \r\n");
      out.write("<P>\r\n");
      out.write("2. How well did you feel our customer service representative understood what you were saying? <br> \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q2\" VALUE=\"1\">Extremely long<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q2\" VALUE=\"2\">Quite long <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q2\" VALUE=\"3\">Slightly long<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q2\" VALUE=\"4\">Not at all long <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("3.  How eager to help you were the customer service representatives at our company?<br> \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q3\" VALUE=\"1\">Extremely eager<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q3\" VALUE=\"2\">Very eager<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q3\" VALUE=\"3\">Slightly eager<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q3\" VALUE=\"4\">Not at all eager <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("4.  Would you say that our customer service representative solved your problem or answered your question quickly, slowly, or neither?<br> \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q4\" VALUE=\"1\">Extremely Quick<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q4\" VALUE=\"2\">Very Quick<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q4\" VALUE=\"3\">Quite Slowly<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q4\" VALUE=\"4\">Extremely Slow<br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("5.  How knowledgeable did our customer service representative seem to you?<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q5\" VALUE=\"1\">Extremely knowledgeable<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q5\" VALUE=\"2\">Quite knowledgeable <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q5\" VALUE=\"3\">Slightly knowledgeable<br> \r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q5\" VALUE=\"4\">Not at all knowledgeable <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("6.  How clear was the information that our customer service representative provided to you? <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q6\" VALUE=\"1\">Extremely clear <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q6\" VALUE=\"2\">Quite clear <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q6\" VALUE=\"3\">Moderately clear <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q6\" VALUE=\"4\">Not at all clear <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("7.  How many of your questions/problems did the customer service representative at our company resolve?<br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q7\" VALUE=\"1\">All of them <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q7\" VALUE=\"2\">Most of them <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q7\" VALUE=\"3\">About half of them <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q7\" VALUE=\"4\">None of them <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("8.  How helpful was our customer service representative? <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q8\" VALUE=\"1\">Extremely helpful <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q8\" VALUE=\"2\">Quite helpful <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q8\" VALUE=\"3\">Moderately helpful <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q8\" VALUE=\"4\">Not at all helpful <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("9.  Was your experience with customer service at our company better than you expected it to be, worse than you expected it to be, or about what you expected it to be? <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q9\" VALUE=\"1\">A great deal better <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q9\" VALUE=\"2\">Quite a bit better <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q9\" VALUE=\"3\">Somewhat better <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q9\" VALUE=\"4\">Somewhat worse <br>\r\n");
      out.write("\r\n");
      out.write("<P>\r\n");
      out.write("10.  Overall, are you satisfied with the customer service you received, dissatisfied with our customer service, or neither satisfied nor dissatisfied? <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q10\" VALUE=\"1\">Extremely satisfied <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q10\" VALUE=\"2\">Quite satisfied <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q10\" VALUE=\"3\">Quite dissatisfied <br>\r\n");
      out.write("<INPUT TYPE=\"RADIO\" NAME=\"Q10\" VALUE=\"4\">Extremely dissatisfied <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<P><P>\r\n");
      out.write("<Center>Thank you for taking the survey.  To submit the results, press the \r\n");
      out.write("<B>Send info</B> button below.\r\n");
      out.write("</center><P><P>\r\n");
      out.write(" \r\n");
      out.write("<input type=submit VALUE=\"Send info\"> <input type=reset VALUE=\"Clear values\">\r\n");
      out.write("<HR>\r\n");
      out.write("\r\n");
      out.write("</FORM>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
