//int a = 10;
//String name = ""
////println(a instanceof int);  // here you are checking whether a belongs to int
//println(name instanceof String);

def b = 10
println("b belongs to Integer  " + (b instanceof Integer))
println("b belongs to Byte  " + (b instanceof Byte))

def c = 890000009999999
println("c belongs to Integer  " + (c instanceof Integer))
println("c belongs to Long  " + (c instanceof Long))

def bigValue=2232333333333333333333333333333333333331212121212092347329473433483473984732948734983473984739473498473289472394238437498479487948749387492479479347943794479;
println("bigValue belongs to BigInteger " + (bigValue instanceof BigInteger))

