#include <stdio.h>
#include <stdlib.h>
//统计一个数的二进制数1的个数
//1.此函数不适合负数统计
int countBit(int num){
	
	int count = 0;
	while (num){
		//此处校验最后一个bit位是不是1
		if (num % 2 == 1){
			++count;
		}
		num /= 2;
	}
	return count;
}
//2.适合任何数
int countBit1(int num){
	int count = 0;
	for (int i = 0; i < 32; i++){
		if (num&(0x1 << i)){
			++count;
		}
	}
	return count;
}

//逆转字符串
void reveser(char *ch){
	char* start = ch;
	char* end = ch + strLength(ch) - 1;
	if (*ch== '\0')
		return;
	char tmp =*start;
	*start =*end;
	*end = tmp;
	*end = '\0';
	reveser(ch+1);
	*end = tmp;

}
//字符串长度
int strLength(char *s){
	if (*s == '\0')
		return 0;
	return 1 + strLength(s + 1);
}
int main(){


	printf("%d\n", countBit1(-127));
	char ch[] = "abcdef";
	reveser(ch);
	printf("%s\n", ch);
	system("pause");
	return 0;
}