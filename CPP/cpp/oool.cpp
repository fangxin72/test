/***
 * @Author: Yilsi
 * @Date: 2022-11-09 07:46:05
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 10:13:03
 * @FilePath: \HTMLc:\VSCode\CPP\cpp\oool.cpp
 * @Description: I don't know.
 * @Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * @Copyright (c) 2022 by Fx, All Rights Reserved.
 */
/***
 * @Author: Yilsi
 * @Date: 2022-11-09 07:46:05
 * @LastEditors: Fx
 * @LastEditTime: 2022-11-10 10:13:01
 * @FilePath: \HTMLc:\VSCode\CPP\cpp\oool.cpp
 * @Description: I don't know.
 * @Cuius rei demonstrationem mirabilem sane detexi. Hanc marginis exiguitas non caperet.
 * @Copyright (c) 2022 by Fx, All Rights Reserved.
 */
#include <iostream>
#include <stdlib.h>
#include <math.h>
using namespace std;
class MyScores {
public:
    int stuNum;
    int *stuScore;
    float *score2Grade;
    float *persentGrade;
    int randScore() {
        int num = rand() % 101;
        return num;
    }
    void stuRandomScore(int stuScore[]) {
        for (int i = 0; i < stuNum; i++)
            stuScore[i] = randScore();
        for (int i = 0; i < stuNum; i++)
            cout << "第" << i + 1 << "位同学成绩为：" << stuScore[i] << endl;
    }
    void Score2Grade(int stuScore[]) {
        for (int i = 0; i < stuNum; i++)
            if (stuScore[i] >= 50)
                score2Grade[i] = float(stuScore[i]) / 10 - 5;
            else
                score2Grade[i] = 0;
        for (int i = 0; i < stuNum; i++)
            cout << "第" << i + 1 << "位同学绩点：" << score2Grade[i] << endl;
    }
    void PersentGrade(float score2Grade[5]) {
        int per[5] = {0};
        for (int i = 0; i < stuNum; i++) {
            if (score2Grade[i] >= 0 && score2Grade[i] <= 1)
                per[0]++;
            if (score2Grade[i] > 1 && score2Grade[i] <= 2)
                per[1]++;
            if (score2Grade[i] > 2 && score2Grade[i] <= 3)
                per[2]++;
            if (score2Grade[i] > 3 && score2Grade[i] <= 4)
                per[3]++;
            if (score2Grade[i] > 4 && score2Grade[i] <= 5)
                per[4]++;
        }
        for (int i = 0; i < 5; i++) {
            persentGrade[i] = float(per[i])
                              / stuNum;
            cout << i << "~" << i + 1 << "比例为：" << persentGrade[i] << endl;
        }
    }
    float Average(int *stuScore) {
        int sum = 0;
        for (int i = 0; i < stuNum; i++) // 求和
            sum += stuScore[i];
        return float(sum) / stuNum; // 得到平均值
    }
    float StandardDeviation(int *stuScore) {
        float sum = 0;
        float average = Average(stuScore);
        for (int i = 0; i < stuNum; i++) // 求和
            sum += pow(stuScore[i] - average, 2);
        return sqrt(sum / stuNum);
    }
};

void main() {
    MyScores t;
    cin >> t.stuNum;
    t.stuScore = new int[t.stuNum];
    t.score2Grade = new float[t.stuNum];
    t.persentGrade = new float[5];
    t.stuRandomScore(t.stuScore);
    cout << endl;
    t.Score2Grade(t.stuScore);
    cout << endl;
    t.PersentGrade(t.score2Grade);
    cout << endl;
    float average = t.Average(t.stuScore);
    cout << "平均值：" << average << endl;
    float sd = t.StandardDeviation(t.stuScore);
    cout << "标准差：" << sd << endl;
    system("pause");
}
