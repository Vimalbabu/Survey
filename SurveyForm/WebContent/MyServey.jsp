<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Survey Form</title>
</head>
<body>
	<FORM  method="post" action="Survey">
<H1><CENTER style="color:RED"><marquee>Customer Survey Form</marquee></CENTER></H1>


<H3>Please tell us a little about yourself. </H3>

<LEFT>
First Name: <INPUT TYPE="text" NAME="Fname" SIZE=40 MAXLENGTH=80>
<BR>
<BR>
Last Name: <INPUT TYPE="text" NAME="Lname" SIZE=40 MAXLENGTH=80>
<BR>
<BR>
Email Address: <INPUT TYPE="text" NAME="Email" SIZE=40 MAXLENGTH=80>
<BR>
<BR>
Phone No: <INPUT TYPE="text" NAME="Phone" SIZE=40 MAXLENGTH=80>
<BR>
<BR>
</LEFT>

<P>
Customer State:<SELECT NAME="State" >
<OPTION SELECTED VALUE=""> 
<OPTION VALUE="AL">AL
<OPTION VALUE="CA">CA
<OPTION VALUE="FL">FL
<OPTION VALUE="ID">ID
<OPTION VALUE="IL">IL
<OPTION VALUE="IN">IN
<OPTION VALUE="KY">KY
<OPTION VALUE="MD">MD
<OPTION VALUE="NJ">NJ
<OPTION VALUE="NY">NY
<OPTION VALUE="WA">WA</SELECT>         
<P>
Product: 
<INPUT TYPE="RADIO" NAME="Product" VALUE="F">FIOS TV
<INPUT TYPE="RADIO" NAME="Product" VALUE="I">Internet 
<INPUT TYPE="RADIO" NAME="Product" VALUE="T">FDV
   
<H3> <center>Customer Satisfaction Survey Form</center>
</H3>

<P>
1.How long was your wait on hold before speaking with our customer service representative?<br> 
<INPUT TYPE="RADIO" NAME="Q1" VALUE="1">Extremely long<br>
<INPUT TYPE="RADIO" NAME="Q1" VALUE="2">Quite long <br>
<INPUT TYPE="RADIO" NAME="Q1" VALUE="3">Slightly long<br>
<INPUT TYPE="RADIO" NAME="Q1" VALUE="4">Not at all long<br>
  
<P>
2. How well did you feel our customer service representative understood what you were saying? <br> 
<INPUT TYPE="RADIO" NAME="Q2" VALUE="1">Extremely long<br>
<INPUT TYPE="RADIO" NAME="Q2" VALUE="2">Quite long <br>
<INPUT TYPE="RADIO" NAME="Q2" VALUE="3">Slightly long<br>
<INPUT TYPE="RADIO" NAME="Q2" VALUE="4">Not at all long <br>

<P>
3.  How eager to help you were the customer service representatives at our company?<br> 
<INPUT TYPE="RADIO" NAME="Q3" VALUE="1">Extremely eager<br>
<INPUT TYPE="RADIO" NAME="Q3" VALUE="2">Very eager<br>
<INPUT TYPE="RADIO" NAME="Q3" VALUE="3">Slightly eager<br>
<INPUT TYPE="RADIO" NAME="Q3" VALUE="4">Not at all eager <br>

<P>
4.  Would you say that our customer service representative solved your problem or answered your question quickly, slowly, or neither?<br> 
<INPUT TYPE="RADIO" NAME="Q4" VALUE="1">Extremely Quick<br>
<INPUT TYPE="RADIO" NAME="Q4" VALUE="2">Very Quick<br>
<INPUT TYPE="RADIO" NAME="Q4" VALUE="3">Quite Slowly<br>
<INPUT TYPE="RADIO" NAME="Q4" VALUE="4">Extremely Slow<br>

<P>
5.  How knowledgeable did our customer service representative seem to you?<br>
<INPUT TYPE="RADIO" NAME="Q5" VALUE="1">Extremely knowledgeable<br>
<INPUT TYPE="RADIO" NAME="Q5" VALUE="2">Quite knowledgeable <br>
<INPUT TYPE="RADIO" NAME="Q5" VALUE="3">Slightly knowledgeable<br> 
<INPUT TYPE="RADIO" NAME="Q5" VALUE="4">Not at all knowledgeable <br>

<P>
6.  How clear was the information that our customer service representative provided to you? <br>
<INPUT TYPE="RADIO" NAME="Q6" VALUE="1">Extremely clear <br>
<INPUT TYPE="RADIO" NAME="Q6" VALUE="2">Quite clear <br>
<INPUT TYPE="RADIO" NAME="Q6" VALUE="3">Moderately clear <br>
<INPUT TYPE="RADIO" NAME="Q6" VALUE="4">Not at all clear <br>

<P>
7.  How many of your questions/problems did the customer service representative at our company resolve?<br>
<INPUT TYPE="RADIO" NAME="Q7" VALUE="1">All of them <br>
<INPUT TYPE="RADIO" NAME="Q7" VALUE="2">Most of them <br>
<INPUT TYPE="RADIO" NAME="Q7" VALUE="3">About half of them <br>
<INPUT TYPE="RADIO" NAME="Q7" VALUE="4">None of them <br>

<P>
8.  How helpful was our customer service representative? <br>
<INPUT TYPE="RADIO" NAME="Q8" VALUE="1">Extremely helpful <br>
<INPUT TYPE="RADIO" NAME="Q8" VALUE="2">Quite helpful <br>
<INPUT TYPE="RADIO" NAME="Q8" VALUE="3">Moderately helpful <br>
<INPUT TYPE="RADIO" NAME="Q8" VALUE="4">Not at all helpful <br>

<P>
9.  Was your experience with customer service at our company better than you expected it to be, worse than you expected it to be, or about what you expected it to be? <br>
<INPUT TYPE="RADIO" NAME="Q9" VALUE="1">A great deal better <br>
<INPUT TYPE="RADIO" NAME="Q9" VALUE="2">Quite a bit better <br>
<INPUT TYPE="RADIO" NAME="Q9" VALUE="3">Somewhat better <br>
<INPUT TYPE="RADIO" NAME="Q9" VALUE="4">Somewhat worse <br>

<P>
10.  Overall, are you satisfied with the customer service you received, dissatisfied with our customer service, or neither satisfied nor dissatisfied? <br>
<INPUT TYPE="RADIO" NAME="Q10" VALUE="1">Extremely satisfied <br>
<INPUT TYPE="RADIO" NAME="Q10" VALUE="2">Quite satisfied <br>
<INPUT TYPE="RADIO" NAME="Q10" VALUE="3">Quite dissatisfied <br>
<INPUT TYPE="RADIO" NAME="Q10" VALUE="4">Extremely dissatisfied <br>


<P><P>
<Center>Thank you for taking the survey.  To submit the results, press the 
<B>Send info</B> button below.
</center><P><P>
 
<input type=submit VALUE="Send info"> <input type=reset VALUE="Clear values">
<HR>

</FORM>
</body>
</html>