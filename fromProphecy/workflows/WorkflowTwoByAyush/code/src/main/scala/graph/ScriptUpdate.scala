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

@Visual(id = "ScriptUpdate", label = "ScriptUpdate", x = 170, y = 80, phase = 0)
object ScriptUpdate {

  def apply(spark: SparkSession): Script = {
    import spark.implicits._

    out

  }

}
