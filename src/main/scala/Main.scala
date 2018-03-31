package main.scala

import org.apache.spark.mllib.classification.LogisticRegressionWithLBFGS
import org.apache.spark.mllib.linalg.Vectors
import org.apache.spark.mllib.regression.LabeledPoint
import org.apache.spark.{SparkConf, SparkContext}

object Main {
//  val path = "/Users/gilbert/Documents/saym/nlp-general/src/main/resources/EntertainmentMusicBrainz/artist_lite.csv"

  def main(args: Array[String]) {
    println("Hello World")
    //Create a SparkContext to initialize Spark
    val conf = new SparkConf()
    conf.setMaster("local")
    conf.setAppName("Word Count")
    val sc = new SparkContext(conf)

//    // Load the text into a Spark RDD, which is a distributed representation of each line of text
//    val textFile = sc.textFile("src/main/resources/shakespeare.txt")
//
//    //word count
//    val counts = textFile.flatMap(line => line.split(" "))
//      .map(word => (word, 1))
//      .reduceByKey(_ + _)
//
//    counts.foreach(println)
//    System.out.println("Total words: " + counts.count())
//    counts.saveAsTextFile("/tmp/shakespeareWordCount")

    LogisticClassificationDemo.runLRDemo(sc)




  }
}