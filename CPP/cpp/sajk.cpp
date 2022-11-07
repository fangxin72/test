#include <iostream>
#include <iomanip>
#include <string>
#include <cctype> //判断字符类型需要的头文件
using namespace std;
int main()
{
    string str;
    int len;
    int n;
    int count;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> str;
        count = 0;
        len = str.length();
        for (int j = 0; j < len; j++)
        {
            if (isdigit(str[j]))
            {            //判断字符是否是数字
                count++; //计数
            }
        }
        cout << count << endl;
    }
    system("pause");
}