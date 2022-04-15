
// '' ,"" ,'''''' ,""" """ ,"\special" "interploation" = \slash\


//Slashy Strings
//syntax1 : normal string
def str = /This is slashy string/
println str
//Syntax 2 : it allows special characters as
def myquote =/How are you! \i am fine \;/;
println myquote
//syntax 3 : multi line with slashy strings
def doc = / hello
 how are you?
 welcome
 greetings   
/;
println doc;

// syntax 4 : interpolation with slashy strings
def name='Subramanian'
def greeting= / Hello ${name} /;
println greeting