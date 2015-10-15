package com.scala.examples

import ch.qos.logback.core.util.StatusPrinter
import ch.qos.logback.classic.LoggerContext
import org.slf4j.LoggerFactory

object MyMain extends App {


  def logger = LoggerFactory.getLogger(this.getClass)
  
  def printSomething = {
    for(i <- 1 to 500  ){
      logger.debug("Hello, debug "+i)
      logger.info("Hello, debug "+i)
      logger.error("Hello, debug "+i)
    }
  }
  
  printSomething
}