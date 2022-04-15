
//Multi line java synatx:
String title = "Airbus";
String doc = "<html>" +
        "<head>" +
        "<title>" + title + "</title>" +
        "<body>" +
        "<h1> Hello</h1>" +
        "</body>" +
        "</body></html>";
System.out.println(doc);
//Groovy Style :  ''' ''' Using single triple quote : you cant interpolate
def mydoc ='''
  <html>
  <head>
    <title>Airbus</title>
  </head>
  <body>
     <h1>Hello</h1>
  </body>
  </html>  
'''
println(mydoc)
//double triple quote

def message="Hello"

def mynewDoc = """
  <html>
  <head>
    <title>$title</title>
  </head>
  <body>
     <h1>$message</h1>
  </body>
  </html>  
"""
println(mynewDoc)
