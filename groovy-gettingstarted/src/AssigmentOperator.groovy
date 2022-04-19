//single assignment
def a = 10;
def b = 20;
println "$a $b";
//multiple assignment : java style
int s = 1, d = 80;
def x = 1, y = 2;
println "$x $y";
//multiple assignment : groovy style
def (x1, y1, de) = [10, 20, 9];
println "$x1 $y1 $de";
//mixed data type in one line
def (status, today, counter) = [true, "02-02-19", 1];
println "$status  $today  $counter"

//extra values are left
def (one, two) = [1, 2, 3, 4, 5];
println "$one $two";

//lesser values but extra variable and its value is null
def (xy, xz, xa) = [1, 3];
println "$xy $xz $xa";
//def (name,age,city)//error
def (name, age, city) = []; //empty brackets, all variables gets null as default value
println "$name $age $city"

//assignment and arthimetic
def qty = 100;
def qtyCounter = qty + 1;
println("QtyCounter $qtyCounter")
qtyCounter +=1 // short cut for the above
println("QtyCounter $qtyCounter")