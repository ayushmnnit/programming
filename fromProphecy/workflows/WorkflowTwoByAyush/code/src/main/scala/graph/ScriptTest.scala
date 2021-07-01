package graph

import io.prophecy.libs._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import config.ConfigStore._
import udfs.UDFs._
import udfs._
import graph._

@Visual(id = "ScriptTest", label = "Script-Test", x = 170, y = 80, phase = 0)
object ScriptTest {

  def apply(spark: SparkSession): Script = {
    import spark.implicits._

    out

  }

}
