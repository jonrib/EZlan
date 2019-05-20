!DEBUG!;
n = 20;

while n > 0 {

  # expressions can be surrounded by parenthesis, of course
  if (n % 2 == 0) {
    see n + " -> even";
  }
  else {
    see n + " -> odd";
  }

  n = n - 1;
}