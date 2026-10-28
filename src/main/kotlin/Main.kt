package com.m486

import com.sun.net.httpserver.HttpServer
import java.net.InetSocketAddress
import java.util.concurrent.Executors

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val port = 8080
    val server = HttpServer.create(InetSocketAddress(port), 0)

    server.createContext("/api/v1/logs" , LogsHandler())
    server.createContext("/api/v1/logs/", LogsDetailHandler())

    server.executor = Executors.newVirtualThreadPerTaskExecutor()
    server.start()

}