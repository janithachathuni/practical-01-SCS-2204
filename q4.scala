object bookPrices{
    def bookPrice(n:Int):Double=24.95*n

    def discount(price:Double):Double=price*0.4

    def shipping(n:Int):Double={
        if(n>50){
            3*50 + (n-50)*0.75
        }else{
            3*n
        }
    }

    def totalPrice(n:Int):Double=bookPrice(n)-discount(bookPrice(n))+shipping(n)

    def main(args :Array[String]):Unit={
        printf("%s %f","Total cost : ",totalPrice(60))
    }
}