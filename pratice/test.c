// creating stack of n size ( from user ); , 1 asking to user what to do 1 for push , 2 for pop, 3 for display 4 exit ;

#include <stdlib.h>
#include <stdio.h>
int elem;
int o;
int top = -1;
void push(int s, int data, int sa[])
{
    if (top == s - 1)
    {
        printf("stack overflow!");
    }
    else
    {
        sa[top] = data;
        top++;
    }
}

int pop(int s, int sa[])
{
    if (top == -1)
    {
        printf("stack underflow!");
    }
    else
    {
        elem = sa[top];

        top--;
    }
    return elem;
}

void display(int sa[])
{
    if (top == -1)
    {
        printf("stack underflow!");
    }
    else
    {
        for (int i = top; i >= 0; i--)
        {
            printf("item at %d = %d", i, sa[i]);
        }
    }
}

int main()
{
    printf("Enter the size of the stack :");
    int n;
    scanf("d", &n);
    int sa[n];

    while (1)
    {
        printf("Enter 1.push 2.pop 3.display 4.exit");
        int choice;
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter element to be inserted : \n");
            int temp;
            scanf("%d", &temp);
            (n, temp, sa);
            break;
        case 2:
            o = pop(n, sa);
            printf("Deleted item : %d \n", o);
            break;
        case 3:
            display(sa);
            break;
        case 4:
            exit(0);
            break;
        default:
            printf("Invalid choice:");
            break;
        }
    }
}