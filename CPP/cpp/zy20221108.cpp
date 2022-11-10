#include <iostream>
using namespace std;

// 函数原型声明
double ave(int n, double array[]);             // 求平均值
double max(int n, double array[]);             // 求最大值
double min(int n, double array[]);             // 求最小值
double var(double ave, int n, double array[]); // 求方差

// 主函数
int main() {
    const int nummax = 100; // 定义一个班同学的最大人数
    double score[nummax];
    double num;uuu
    double average;

    cout << "请输入本次考试的人数：";
    cin >> num;
    for (int i = 0; i < num; ++i) {
        cout << "请输入第" << i + 1 << "位同学的成绩：";
        cin >> score[i];
    }
    average = ave(num, score);
    // 当数组作为函数参数时，要注意只需写入数组名（本质上是数组首位的地址）
    cout << "此次考试的最高分为：" << max(num, score) << endl;
    cout << "此次考试的最低分为：" << min(num, score) << endl;
    cout << "此次考试的平均分为：" << ave(num, score) << endl;
    cout << "此次考试的方差为：" << var(average, num, score) << endl;

    return 0;
}

// 函数定义
double ave(int n, double array[]) {
    int i;
    double sum = 0;
    for (i = 0; i < n; ++i) {
        sum += array[i];
    }
    return sum / n;
}

double max(int n, double array[]) {
    double max = 0;
    int i;
    // 不断更新max值，若array[i]大于当前max值则进行max值的更新
    for (i = 0; i < n; ++i) {
        max = (array[i] > max ? array[i] : max);
    }
    return max;
}

double min(int n, double array[]) {
    double min = 100;
    int i;
    for (i = 0; i < n; ++i) {
        min = (array[i] < min ? array[i] : min);
    }
    return min;
}

double var(double ave, int n, double array[]) {
    double variance = 0;
    for (int i = 0; i < n; ++i) {
        variance += (array[i] - ave) * (array[i] - ave);
    }
    return variance;
}
