object DifferenceOfSquares{

def sumOfSquares(n: Int): Int ={
  var answer = 0
  for (number <- (1 to n)){
    answer = answer + (number * number)
  }
  answer
}

def squareOfSum(n: Int): Int ={
  var answer = 0
  for (number <- (1 to n)) {
    answer = answer + number
  }
  answer * answer
}

def differenceOfSquares(n: Int):Int ={
  squareOfSum(n) - sumOfSquares(n)
}
