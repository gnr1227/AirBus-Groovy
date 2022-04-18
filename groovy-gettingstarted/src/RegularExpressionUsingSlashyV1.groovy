import java.util.regex.Matcher
import java.util.regex.Pattern

//S

println "Regular Expression-Groovy Implementation"
//Step 1: declare input string
def inputString = "hey  hello 0 1, how subramanian , 7m3";
//pattern:
// String pattern = "\\d+";  //java syntax of defining pattern
def pattern = /\d+/ //here we can escape special characters without using special characters
Pattern compiledPattern = Pattern.compile(pattern);
Matcher digitMatcher = compiledPattern.matcher(inputString);
println("Source String " + inputString);
while (digitMatcher.find()) {
    println(digitMatcher.group());
}