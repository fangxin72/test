#include <iostream>
using namespace std;

int main()
{
	int year;
	cin >> year; //键盘中输入一个年份，保存到变量year中

	if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //指定是否为闰年的判断条件
		cout << year << "是闰年" << endl;					   //条件成立则该年份是闰年
	else
		cout << year << "不是闰年" << endl; //否则该年份不是闰年
	system("pause");
	return 0;
}
