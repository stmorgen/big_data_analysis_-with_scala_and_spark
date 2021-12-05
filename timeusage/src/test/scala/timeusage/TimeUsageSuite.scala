package timeusage

import org.apache.spark.sql.{ColumnName, DataFrame, Row}
import org.junit.{Assert, Test}
import org.junit.Assert.assertEquals

import scala.util.Random

class TimeUsageSuite {

  @Test def `to row`: Unit = {
    val strings = List("start", "1", "2.4")

    val row = TimeUsage.row(strings)

    println(row)
  }
}
