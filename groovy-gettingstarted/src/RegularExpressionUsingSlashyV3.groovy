println "Regular Expression-Groovy Implementation"
//Step 1: declare input string
def inputString = "hey  hello 0 1, how subramanian , 7m3";
def matcher = (inputString =~ /\d+/)
while (matcher.find()) {
    println(matcher.group());
}
