
#include<stdio.h>

struct
{
  int si;
  double d;
  float cp;
} s;
void main ()
{
  printf ("%d, %d, %d",  sizeof (s.si), sizeof (s.d), sizeof (s.cp));
}
