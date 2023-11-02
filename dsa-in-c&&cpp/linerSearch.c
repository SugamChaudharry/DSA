#include <stdio.h>
int main(){
    int n , val , flag;
    char want;

do
{   
    printf("Enter length of array : ");
    scanf("%d",&n);
    int Arr[n];
    for (int i = 0; i < n; i++)
    {
        scanf("%d",&Arr[i]);
    }
    printf("Enter value of array \n");
    scanf("%d",&val);
    for (int i = 0; i < n; i++)
    {
        if (Arr[i]==val)
        {
            printf("%d is in a array and at %d \n",val,i+1);
            flag++;
        }        
    }
    if (flag==0)
    {
        printf("%d is not in a array \n\n",val);
    }
    
    
    printf("Arr[%d]= [" ,n );
    for (int i = 0; i < n; i++){

        printf(" %d ",Arr[i]);

        if (i<n-1)
        {
        printf(",");
        }else
        {
        printf("]");
        }
    }
    printf("\n do you want to repeat (y/n) : ");
    scanf(" %c", &want);
} while (want=='y');
    
}