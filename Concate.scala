import Array._
  
 
object Concate
{ 
      
  
def main(args: Array[String]) 
{ 
    var arr1 = Array(1, 2, 3, 4) 
    var arr2 = Array(5, 6, 7, 8) 
  
    var arr3 = concat( arr1, arr2) 
      
     
    for ( x <- arr3 )  
    { 
        println( x ) 
    } 
} 
} 