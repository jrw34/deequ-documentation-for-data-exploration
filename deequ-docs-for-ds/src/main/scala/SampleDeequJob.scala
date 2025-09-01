import TestDataFrameCreator.createTestDataFrame
import org.apache.spark.sql.{DataFrame, SparkSession}

object SampleDeequJob {


  def main(): Unit = {
    //Create spark session 'spark'
    val spark: SparkSession = SparkSession.builder()
      .appName("VerifyDeequ")
      .master("local[*]")
      .getOrCreate()
    //Read Test Data Frame
    val df: DataFrame = createTestDataFrame(spark)

    df.show()
  }

}
