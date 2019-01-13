#include <stdio.h>
#include <stdlib.h>
//1  arr数组名 表示首元素地址
// &数组名   表示整个数组的地址
void First(){
	int arr[] = { 1, 2, 3, 4 };
	int *ptr = (int *)(&arr + 1);   //&arr + 1表示元素4地址的下一个地址
	printf("%d %d\n", *(arr + 1), *(ptr - 1));
}

//2.
struct Test{
	int num;
	char *pcName;
	short sDate;
	char ch[2];
	short sBa[4];
}*p;

//3
void Third(){
	int arr[] = { 1, 2, 3, 4 };
	int *ptr = (int *)(&arr + 1);
	//这个题涉及到内存分配 
	//00 00 00 01此机器是小端，再次我们写一个判断机器是大小端的代码
	int *ptr2 = (int *)((int)arr + 1);
	printf("%x,%x\n", ptr[-1], *ptr2);   //4,20000000
	//这个题涉及到内存分配   
}
//3.1判断机器大小端，小端返回1，大端返回0
//小端：低位在低地址上
//大端：低位在高地址上
int isLittle(){
	int n = 0x11223344;
	char *p = (char *)&n;
	if (*p == 0x11)
		return 0;
	return 1;
}

//4.主要考指针和逗号运算符
void Fourth(){
	int arr[3][4] = { (1, 2), (3, 4), (5, 6) };
	int *p;
	p = arr[0];
	printf("%d\n", p[0]);   //2  
}

//5.
void Fifth(){
	int arr[2][5] = { 0 };
	int(*p)[4];
	p = arr;
	printf("arr_ptr = %#p,p_ptr = %#p\n", &arr[4][2], &p[4][2]);
}

//6
void Sixth(){
	int arr[2][5] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	int *p1 = (int *)(&arr + 1);
	int *p2 = (int *)(*(arr + 1));
	printf("%d,%d\n", *(p1 - 1),*(p2 - 1));
}

//7
void Seventh(){
	char *arr[] = { "I", "Want", "To", "work", "at", "MeiTuan" };
	char **p = arr;
	p++;
	printf("%s\n", *p);
}

//8
void Eighth(){
	char *c[] = { "ENTER", "NEW", "POINT", "FIRST" };
	char **cp[] = { c + 3, c + 2, c + 1, c };
	char ***cpp = cp;
	printf("%s\n", **++cpp);
	printf("%s\n", *--*++cpp + 3);
	printf("%s\n", *cpp[-2] + 3);
	printf("%s\n", cpp[-1][-1] + 1);
}
int main(){

	//First();
	
	//printf("%d\n", sizeof(*p));  //结构体大小
	//printf("%p\n", p);
	////指针加1   结果要看指针的类型  int就是4  char 就是1  该题是20
	//printf("%p\n", p + 0x1);
	////将p强制转换成整型p=0   所以就是1十六进制表示结果
	//printf("%p\n", (unsigned long)p + 0x1);
	//printf("%p\n", (unsigned int*)p + 0x1);

	//Third();   //4,20000000
	//printf("%d\n", isLittle());


	//Fourth();  //2


	//Fifth();

	//Sixth();   //10,5

	//Seventh();   //Want

	Eighth(); // POINT  ER   ST  EW
	system("pause");
	return 0;
}