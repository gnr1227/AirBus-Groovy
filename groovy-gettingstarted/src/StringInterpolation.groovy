//How to interpolate strings

def name = "Subramanian"
//here message type is groovy.GString not java.lang.String
def message = "Hello ${name}" // string interpolation
println(message)

//
def host = "airbus.com"
def port = 8080
def url = "/api"
def path = "/pipelines"

//def uri = "http://${host}:${port}${url}${path}";
def uri = "http://$host:$port$url$path";

println(uri)

