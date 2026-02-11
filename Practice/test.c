#include<stdio.h>
int main(){
    int x=5;
    // int y=x++ + ++x;

    int arr[]={1,2,3,4,5};
    int *ptr=&arr[0];
    printf("%d\n",&ptr);
    ptr++;
    printf("%d",&ptr);

    // printf("%d",y);
}