#include <stdio.h>
#include <stdlib.h>
//1  arr������ ��ʾ��Ԫ�ص�ַ
// &������   ��ʾ��������ĵ�ַ
void First(){
	int arr[] = { 1, 2, 3, 4 };
	int *ptr = (int *)(&arr + 1);   //&arr + 1��ʾԪ��4��ַ����һ����ַ
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
	//������漰���ڴ���� 
	//00 00 00 01�˻�����С�ˣ��ٴ�����дһ���жϻ����Ǵ�С�˵Ĵ���
	int *ptr2 = (int *)((int)arr + 1);
	printf("%x,%x\n", ptr[-1], *ptr2);   //4,20000000
	//������漰���ڴ����   
}
//3.1�жϻ�����С�ˣ�С�˷���1����˷���0
//С�ˣ���λ�ڵ͵�ַ��
//��ˣ���λ�ڸߵ�ַ��
int isLittle(){
	int n = 0x11223344;
	char *p = (char *)&n;
	if (*p == 0x11)
		return 0;
	return 1;
}

//4.��Ҫ��ָ��Ͷ��������
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
	
	//printf("%d\n", sizeof(*p));  //�ṹ���С
	//printf("%p\n", p);
	////ָ���1   ���Ҫ��ָ�������  int����4  char ����1  ������20
	//printf("%p\n", p + 0x1);
	////��pǿ��ת��������p=0   ���Ծ���1ʮ�����Ʊ�ʾ���
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