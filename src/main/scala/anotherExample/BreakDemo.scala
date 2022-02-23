package anotherExample

// Importing break package
import scala.util.control.Breaks._
object BreakDmo 
{
  // Main method
  def main(args: Array[String]) 
  {
    // Here, breakable is used to prevent exception 
    breakable 
    { 
        for (a <- 1 to 10) 
        {
            for(b <- 1 to 5)
            {
                if (a == 6) {
            
                    // terminate the loop when 
                    // the value of a is equal to 6
                    println("Breaking here...")
                    break 
                }
                else
                    println(a,b);
            }
        }
    }
  }
}
