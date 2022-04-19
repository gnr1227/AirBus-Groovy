import java.util.regex.Matcher
import java.util.regex.Pattern

println "Regular Expression-Groovy Implementation"
//Step 1: declare input string
def inputString = "hey  hello 0 1, how subramanian , 7m3";
//pattern:
def compiledPattern = ~/\d+/ //
Matcher digitMatcher = compiledPattern.matcher(inputString);
println("Source String " + inputString);
while (digitMatcher.find()) {
    println(digitMatcher.group());
}