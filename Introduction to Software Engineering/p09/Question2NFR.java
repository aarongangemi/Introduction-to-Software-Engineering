public double sumX()
{
  int x;
  double y;
  int i;
  i = 0;
  y = 0.0;
  x = getX(i)

  while(x != 0)
  {
    y = y + x;
    x = getX(i);
    i++;
  }
  return y;
}
