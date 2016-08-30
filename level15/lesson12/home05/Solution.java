package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {
    public Solution(){};
    public Solution(Byte b){};
    public Solution(Short s){};
    protected Solution(String s){};
    protected Solution(Object o){};
    protected Solution(boolean b){};
    Solution(int a){};
    Solution(double d){};
    Solution(float f){};
    private Solution(byte b, byte c){};
    private Solution(int b, int c){};
    private Solution(double b, double c){};
}

