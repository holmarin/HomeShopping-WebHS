package SMS;

import java.io.*;
import java.net.*;


public class SendSMS {
  public static void main(String[] args) throws Exception {
  

/*
    String mobilephone=null;
    SingleConnection conn = new SingleConnection();
    mobilephone=conn.getMobile(username);
    System.out.println(mobilephone);
*/          
      String mensajeAEnviar = "login=" 
          + URLEncoder.encode("holmarin@uan.edu.co", "UTF-8") 
          + "&apiID=" 
          + URLEncoder.encode("06FC7DAF-37F1-A984-7513-557A3CF89707", "UTF-8")
          + "&phone_1=" 
          + URLEncoder.encode("+573158662829", "UTF-8")
  //      + URLEncoder.encode(mobilephone, "UTF-8")
          + "&text_1=" 
          + URLEncoder.encode("Linea de prueba .. debe ir el txto del select", "UTF-8");
  
    /* Conectamos con esa URL */
      URL url = new 
      URL("http://www.smsmasivos.es/api/send");
      URLConnection connection = url.openConnection();
      connection.setDoOutput(true);
  

      OutputStreamWriter out = new OutputStreamWriter(
      connection.getOutputStream());
      out.write(mensajeAEnviar);
      out.close();
  

      BufferedReader in = new BufferedReader(
                  new InputStreamReader(
                  connection.getInputStream()));
          
      String decodedString;
  
      while ((decodedString = in.readLine()) != null) {
          System.out.println(decodedString);
      }
  
      in.close();
  }
}