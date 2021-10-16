#include <iostream.h>
#include <conio.h>
void main()
{
  clrscr();

  int size,i;  // variable declaration

  int *arr;
  arr= new int;

//  int *arr=new int[size];


//int *arr = new int[size];   // creating an array   */

  cout<<"Enter the size of the array : ";
  cin >> size;
  cout<<"\nEnter the elements : ";
  for(i=0;i<size;i++)   // for loop
   {
     cin>>arr[i];
   }
  cout<<"\nThe elements that you have entered are :";
  for(i=0;i<size;i++)    // for loop
   {
     cout<<arr[i]<<",";
   }

  delete arr;  // deleting an existing array.
}
