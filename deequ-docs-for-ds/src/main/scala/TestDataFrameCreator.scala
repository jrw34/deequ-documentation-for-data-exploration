import org.apache.spark.sql.types.{StringType, StructField, StructType}
import org.apache.spark.sql.{DataFrame, Row, SparkSession}

object TestDataFrameCreator {


  // Start with a simple function to create dataframe
  def createTestDataFrame(spark: SparkSession): DataFrame = {

    val testData = Seq(
      Seq("1", s"${(2^32)+1}", "hello", "wow"),
      Seq("1", s"${(2^32)+2}", "hey", ""),
      Seq("0", s"${(2^32)+3}", "hi", ""),
      Seq("1", s"${(2^32)+4}", "howdy", "woohoo"),
      Seq("1", s"${(2^32)+5}","", "yeehaw")
    )

    val testSchema = StructType(Seq(
      StructField("numbers", StringType, nullable = true),
      StructField("longer_numbers", StringType, nullable = true),
      StructField("greetings", StringType, nullable = true),
      StructField("fun_expression", StringType, nullable = true),
    ))

    val rdd = spark.sparkContext.parallelize(testData.map(row => Row.fromSeq(row)))

    spark.createDataFrame(rdd, testSchema)
  }



}

