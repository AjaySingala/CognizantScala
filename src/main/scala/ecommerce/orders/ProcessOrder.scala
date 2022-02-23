package ecommerce.orders

import ecommerce.customers._
import ecommerce.products._

class ProcessOrders extends CustomerData with ProductData
{
    var Id: Int = 0
    var Name: String = "Name"
    var Description: String = "Desc"
}

object TTT {
    def main(args: Array[String]) {
        val cust = new CustomerData()
        
    }
}