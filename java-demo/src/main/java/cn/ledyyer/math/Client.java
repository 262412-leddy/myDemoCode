package cn.ledyyer.math;

import org.apache.commons.math3.distribution.*;
import org.apache.commons.math3.stat.descriptive.moment.Mean;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

public class Client {
    public static void main(String[] args) {
        double[] value = {1.0, 2.0, 3.0, 4.0, 5.0};

        // 计算平均值
        Mean mean = new Mean();
        double m = mean.evaluate(value);
        System.out.println("平均值：" + m);

        // 计算标准差
        StandardDeviation standardDeviation = new StandardDeviation();
        double sd = standardDeviation.evaluate(value);
        System.out.println("标准差：" + sd);

        // 创建一个标准正态分布
        NormalDistribution normalDistribution = new NormalDistribution(0, 1);
        double x = normalDistribution.probability(0, Integer.MAX_VALUE);
        System.out.println("良率：" + x);

        // 知道概率算积分上限，即所谓的Z分数
        double z_bench = normalDistribution.inverseCumulativeProbability(x);
        System.out.println("z_bench: " + z_bench);
    }
}
