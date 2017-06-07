package com.gkrlo.spark.firstapp

import org.apache.spark.SparkContext
import org.apache.spark.SparkConf

object HelloWorld extends App {

  val conf = new SparkConf().setAppName("HelloWorld").setMaster("local")
  val sc = new SparkContext(conf)

  println("************")
  println("Hello, world!")
  println("************")

  sc.stop()
}
