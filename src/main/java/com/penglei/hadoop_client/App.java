package com.penglei.hadoop_client;

import java.net.URI;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		FileSystem fs = FileSystem.newInstance(new URI("hdfs://192.168.0.104:9000"), new Configuration());

		fs.create(new Path("/hello"));
	}
}
